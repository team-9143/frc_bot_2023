// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

// TODO: implement, with encoders
public class DriveDistance extends CommandBase {
  private final Drivetrain drivetrain;
  private static double distance;


  public DriveDistance(Drivetrain drivetrain) {
    this.drivetrain = drivetrain;
    
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    drivetrain.encoders[0].setPosition(0);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    Double speed = -(Math.pow(drivetrain.encoders[0].getPosition()/distance,10)) + 1;
    speed = (distance < 0) ? -speed : speed;
    if (drivetrain.encoders[0].getPosition() < Math.abs(distance)){
      drivetrain.robotDrive.arcadeDrive(0.5*speed, 0);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    drivetrain.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }

  public void setDistance(double fdistance) {
      distance = fdistance;
      schedule();
  }
}
