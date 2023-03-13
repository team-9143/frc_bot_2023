// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Drivetrain;

public final class Autos extends CommandBase {
  private Drivetrain drivetrain;

  /** Example static factory for an autonomous command. */
  /*
  public static CommandBase exampleAuto(ExampleSubsystem subsystem) {
    return Commands.sequence(subsystem.exampleMethodCommand(), new ExampleCommand(subsystem));
  }
  */

  public Autos(Drivetrain drivetrain) {
    this.drivetrain = drivetrain;
    
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(drivetrain);
    
  } 
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
      SmartDashboard.getBoolean("Auto", isFinished());
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
      // runs the auto that is selected
      switch (RobotContainer.m_autoSelected){
        case RobotContainer.k1CustomAuto:
          //Put k1 code here
          break;
        case RobotContainer.k2CustomAuto:
          //Put k2
          break;
        case RobotContainer.k3CustomAuto:
          //Put k3
          break;
        case RobotContainer.k4CustomAuto:
          //Put k4
          break;
        case RobotContainer.k5CustomAuto:
          //Put k5
          break;
        case RobotContainer.k6CustomAuto:
          //You know what
          break;
        case RobotContainer.kDefaultAuto:
        default:
          //Put default auto code here
          break;
      }
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {}
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
}