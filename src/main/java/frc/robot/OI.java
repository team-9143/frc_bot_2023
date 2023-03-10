package frc.robot;

import frc.robot.Constants.DeviceConstants;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import com.ctre.phoenix.sensors.Pigeon2;

public class OI {
  public final static LogitechController driver_cntlr = new LogitechController(DeviceConstants.kDriverCntlrPort);
  public final static NetworkTable limelight = NetworkTableInstance.getDefault().getTable("limelight");

  // In proper orientation, Pigeon is flat and facing so that X-axis is forward
  // Roll increases to the right, pitch to the front, and yaw counter-clockwise
  public final static Pigeon2 pigeon = new Pigeon2(DeviceConstants.kPigeonCANid);
}