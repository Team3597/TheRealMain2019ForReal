/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * Add your docs here.
 */
public class DriveTrain {

  private static DifferentialDrive driveTrain;

  private static WPI_TalonSRX bRightDrive;
  private static WPI_TalonSRX fRightDrive;
  private static WPI_TalonSRX bLeftDrive;
  private static WPI_TalonSRX fLeftDrive;

public DriveTrain() {

    fRightDrive = new WPI_TalonSRX(RobotMap.FR_DRIVE_MOTOR_PORT);
    bRightDrive = new WPI_TalonSRX(RobotMap.BR_DRIVE_MOTOR_PORT);
    fLeftDrive = new WPI_TalonSRX(RobotMap.FL_DRIVE_MOTOR_PORT);
    bLeftDrive = new WPI_TalonSRX(RobotMap.BL_DRIVE_MOTOR_PORT);

    bRightDrive.setInverted(RobotMap.BR_DRIVE_INVERTED);
    fRightDrive.setInverted(RobotMap.FR_DRIVE_INVERTED);
    bLeftDrive.setInverted(RobotMap.BL_DRIVE_INVERTED);
    fLeftDrive.setInverted(RobotMap.FL_DRIVE_INVERTED);

    fRightDrive.follow(bRightDrive);
    fLeftDrive.follow(bLeftDrive);

    driveTrain = new DifferentialDrive(bLeftDrive, bRightDrive);

}

public static void driveArcade(float pSpeed, float pRotation) {
  driveTrain.arcadeDrive(pSpeed, pRotation);
}

public static void driveTank(float pLeftSpeed, float pRightSpeed) {
  driveTrain.tankDrive(pLeftSpeed, pRightSpeed);
}

public static void arcadeDriveWithJoystick() {
  double forward = -Robot.io.driveJoystick.getRawAxis(IO.LY_STICK_AXIS) / 1.25f;
  double turn = Robot.io.driveJoystick.getRawAxis(IO.RX_STICK_AXIS) / 1.25f;

  driveTrain.arcadeDrive(turn, forward);
}

public static void tankDriveWithJoystick() {
  double forward = -Robot.io.driveJoystick.getRawAxis(IO.LY_STICK_AXIS) / 1.25f;
  double turn = Robot.io.driveJoystick.getRawAxis(IO.RX_STICK_AXIS) / 1.25f;

  driveTrain.tankDrive(turn, forward);
}

public static int getEncoderValue(WPI_TalonSRX pMotor) {
  return pMotor.getSelectedSensorPosition();
}

public static void resetEncoder(WPI_TalonSRX pMotor) {
  pMotor.getSensorCollection().setQuadraturePosition(0, RobotMap.TALON_TIMEOUT_MS);
}

public static void resetEncoder(int pArrayLength, WPI_TalonSRX[] pMotors) {
  for(int i = 0; i < pArrayLength - 1; i++) {
    resetEncoder(pMotors[i]);
  }
}

}
