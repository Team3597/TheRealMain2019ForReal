/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * Add your docs here.
 */
public class RobotMap {

    public static final int TALON_TIMEOUT_MS = 30;

    //DriveTrain
    public static final int FR_DRIVE_MOTOR_PORT = 1;
    public static final int BR_DRIVE_MOTOR_PORT = 2;
    public static final int FL_DRIVE_MOTOR_PORT = 3;
    public static final int BL_DRIVE_MOTOR_PORT = 4;

    public static final boolean FR_DRIVE_INVERTED = true;
    public static final boolean BR_DRIVE_INVERTED = true;
    public static final boolean FL_DRIVE_INVERTED = false;
    public static final boolean BL_DRIVE_INVERTED = false;

    //Cargo
    public static final int R_INTAKE_MOTOR_PORT = 5;
    public static final int L_INTAKE_MOTOR_PORT = 6;
    public static final int CARGO_ARM_MOTOR_PORT = 0;

    public static final boolean R_INTAKE_INVERTED = true;
    public static final boolean L_INTAKE_INVERTED = true;
    public static final boolean CARGO_ARM_INVERTED = false;

    //Hatch
    public static final int HATCH_ARM_MOTOR_PORT = 1;
    public static final int HATCH_GRIP_MOTOR_PORT = 2;

    public static final boolean HATCH_ARM_INVERTED = false;
    public static final boolean HATCH_GRIPPER_INVERTED = false;

    //Ramp
    public static final int RAMP_MOTOR_PORT = 3;

    public static final boolean RAMP_INVERTED = false;
}
