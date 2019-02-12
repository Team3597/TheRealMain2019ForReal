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

    int button = 0;

    if(io.driveJoystick.getRawButton(IO.A_BUTTON)) {
      button = 1;
    } else if(io.driveJoystick.getRawButton(IO.B_BUTTON)) {
      button = 2;
    } else if(io.driveJoystick.getRawButton(IO.X_BUTTON)) {
      button = 3;
    } else if(io.driveJoystick.getRawButton(IO.Y_BUTTON)) {
      button = 4;
    } else if (io.driveJoystick.getRawButton(IO.LB_BUTTON)) {
      button = 5;
    } else if (io.driveJoystick.getRawButton(IO.RB_BUTTON)) {
      button = 6;
    } else if (io.driveJoystick.getRawButton(IO.BACK_BUTTON)) {
      button = 7;
    } else if (io.driveJoystick.getRawButton(IO.START_BUTTON)) {
      button = 8;
    } else if (io.driveJoystick.getRawButton(IO.L_STICK_BUTTON)) {
      button = 9;
    } else if (io.driveJoystick.getRawButton(IO.R_STICK_BUTTON)) {
      button = 10;
    }

    switch (button) {
      case 1: //A button
        //hatch.gripOpen(1f); <- Example 
        break;
      case 2: //B button
        //hatch.gripClose(1f); <- Example
        break;
      case 3: //X button

        break;
      case 4: //Y button

        break;
      case 5: //LB button

        break;
      case 6: //RB button

        break;
      case 7: //Back button

        break;
      case 8: //Start button

        break;
      case 9: //Left Stick button

        break;
      case 10: //Right Stick button

        break;
      default:
        driveTrain.arcadeDriveWithJoystick();
    }
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

}
