/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * Add your docs here.
 */
public class IO {

    public static final int DRIVE_JOYSTICK_PORT = 0;

    public static final int LX_STICK_AXIS = 0;
    public static final int LY_STICK_AXIS = 1;
    public static final int RX_STICK_AXIS = 4;
    public static final int RY_STICK_AXIS = 5;

    public static final int A_BUTTON = 1;
    public static final int B_BUTTON = 2;
    public static final int X_BUTTON = 3;
    public static final int Y_BUTTON = 4;
    public static final int LB_BUTTON = 5;
    public static final int RB_BUTTON = 6;
    public static final int BACK_BUTTON = 7;
    public static final int START_BUTTON = 8;
    public static final int L_STICK_BUTTON = 9;
    public static final int R_STICK_BUTTON = 10;

    public static Joystick driveJoystick;

    public IO() {
        driveJoystick = new Joystick(DRIVE_JOYSTICK_PORT);
    }
}
