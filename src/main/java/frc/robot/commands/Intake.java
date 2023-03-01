package frc.robot.commands;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.DeviceConstants;

public class Intake extends CommandBase{
    public static  CANSparkMax intakeMotor = new CANSparkMax(DeviceConstants.kIntakeid, MotorType.kBrushed);

    public Intake() {    
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements();
        super.execute();
    }
    @Override
    public void execute() {
        intakeMotor.set(1);

    }
    @Override
    public void end(boolean interrupted) {
        intakeMotor.set(0);
        super.end(interrupted);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}