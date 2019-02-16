/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  public static IO io = new IO();
  public static DriveTrain driveTrain = new DriveTrain();
  public static Cargo cargo = new Cargo();
  public static Hatch hatch = new Hatch();
  public static Ramp ramp = new Ramp();

  @Override
  public void robotInit() {
    
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {

  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {

    io.driveButtonsPressed();
    io.shootButtonsPressed();

    driveTrain.arcadeDriveWithJoystick();
    
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

}
