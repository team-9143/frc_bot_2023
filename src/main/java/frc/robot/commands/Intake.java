// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.IntakeConstants;

import frc.robot.subsystems.IntakePositional;
import frc.robot.subsystems.IntakeWheels;

public class Intake extends CommandBase {
  private final IntakePositional intakePositional;
  private final IntakeWheels intakeWheels;

  public Intake(IntakePositional intakePositional, IntakeWheels intakeWheels) {
    this.intakePositional = intakePositional;
    this.intakeWheels = intakeWheels;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(intakePositional);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    // Sets setpoint down and starts intake
    intakePositional.setSetpoint(IntakeConstants.kDownPos);
    intakePositional.enable();
    intakeWheels.intake_motor.set(IntakeConstants.kIntakeSpeed);

    /*
    // Sets setpoint: up position if RB is pressed, otherwise down
    intakePositional.setSetpoint((OI.driver_cntlr.getRawButton(LogitechController.BTN_RB)) ? IntakeConstants.kUpPos : IntakeConstants.kDownPos);
    intakePositional.enable();

    OI.driver_cntlr.getRawButtonPressed(LogitechController.BTN_RB);
    OI.driver_cntlr.getRawButtonPressed(LogitechController.BTN_LB);
    */
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    /*
    if (OI.driver_cntlr.getRawButtonPressed(LogitechController.BTN_RB)) {
      intakePositional.setSetpoint(IntakeConstants.kUpPos);
    } else if (OI.driver_cntlr.getRawButtonPressed(LogitechController.BTN_LB)) {
      intakePositional.setSetpoint(IntakeConstants.kDownPos);
    }
    */
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // Sets setpoint up and stops intake
    intakePositional.setSetpoint(IntakeConstants.kUpPos);
    intakeWheels.stop();
  }
}