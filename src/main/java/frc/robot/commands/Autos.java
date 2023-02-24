// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;

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
  private static final String kDefaultAuto = "Fly - move";
  private static final String k1CustomAuto = "nothing";
  private static final String k2CustomAuto = "Straight Pick Up";
  private static final String k3CustomAuto = "Wait to Dock";
  private static final String k4CustomAuto = "Two Grid Drops";
  private static final String k5CustomAuto = "Turn Grid + dock";
  private static final String k6CustomAuto = "Turn Grid"; 

  public static String m_autoSelected;
  private final SendableChooser <String> m_Chooser = new SendableChooser<>();
  
    
  
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
      m_Chooser.setDefaultOption("Default Auto", kDefaultAuto);
      m_Chooser.addOption("nothing", k1CustomAuto);
      m_Chooser.addOption("Straight Pick Up", k2CustomAuto);
      m_Chooser.addOption("Wait to Dock", k3CustomAuto);
      m_Chooser.addOption("Two Grid Drops", k4CustomAuto);
      m_Chooser.addOption("Turn Grid + Dock", k5CustomAuto);
      m_Chooser.addOption("Turn Grid", k6CustomAuto);
  
      SmartDashboard.putData("Auto choices", m_Chooser);
  
      m_autoSelected = m_Chooser.getSelected();
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
      switch (m_autoSelected){
        case k1CustomAuto:
          //Put k1 code here
          break;
        case k2CustomAuto:
          //Put k2
          break;
        case k3CustomAuto:
          //Put k3
          break;
        case k4CustomAuto:
          //Put k4
          break;
        case k5CustomAuto:
          //Put k5
          break;
        case k6CustomAuto:
          //You know what
          break;
        case kDefaultAuto:
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