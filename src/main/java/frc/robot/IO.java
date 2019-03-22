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
    public static final int SHOOT_JOYSTICK_PORT = 1;

    public static final int LX_STICK_AXIS = 0;
    public static final int LY_STICK_AXIS = 1;
    public static final int RX_STICK_AXIS = 4;
    public static final int RY_STICK_AXIS = 5;

    public static final int L_TRIGGER_AXIS = 2;
    public static final int R_TRIGGER_AXIS = 3;

    public static final int PAD = 16;

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
    public static final int L_TRIGGER_BUTTON = 11;
    public static final int R_TRIGGER_BUTTON = 12;

    public static Joystick driveJoystick;
    public static Joystick shootJoystick;



    public IO() {
        driveJoystick = new Joystick(DRIVE_JOYSTICK_PORT);
        shootJoystick = new Joystick(SHOOT_JOYSTICK_PORT);
    }

    private static int buttonPressed(Joystick pJoystick) {
        
        if(pJoystick.getRawButton(A_BUTTON)) {
            return A_BUTTON;
        } else if(pJoystick.getRawButton(B_BUTTON)) {
            return B_BUTTON;
        } else if(pJoystick.getRawButton(X_BUTTON)) {
            return X_BUTTON;
        } else if(pJoystick.getRawButton(Y_BUTTON)) {
            return Y_BUTTON;
        } else if (pJoystick.getRawButton(LB_BUTTON)) {
            return LB_BUTTON;
        } else if (pJoystick.getRawButton(RB_BUTTON)) {
            return RB_BUTTON;
        } else if (pJoystick.getRawButton(BACK_BUTTON)) {
            return BACK_BUTTON;
        } else if (pJoystick.getRawButton(START_BUTTON)) {
            return START_BUTTON;
        } else if (pJoystick.getRawButton(L_STICK_BUTTON)) {
            return L_STICK_BUTTON;
        } else if (pJoystick.getRawButton(R_STICK_BUTTON)) {
        return R_STICK_BUTTON;
        } else if (pJoystick.getRawAxis(L_TRIGGER_AXIS) > 0.1f) {
        return L_TRIGGER_BUTTON;
        } else if(pJoystick.getRawAxis(R_TRIGGER_AXIS) > 0.1f) {
        return R_TRIGGER_BUTTON;
        } else if(pJoystick.getPOV() > -1){
            return PAD;
        } else{
            return 0;
        } 
    } 

    public static void driveButtonsPressed() {              //DRIVE CONTROLLER
        switch (buttonPressed(Robot.io.driveJoystick)) {
            case A_BUTTON:
                DriveTrain.toggleTurnSpeed();
                break;
            default:
                Robot.driveTrain.stop();
        }
    }

    public static void shootButtonsPressed() {              //SHOOT CONTROLLER
        switch (buttonPressed(Robot.io.shootJoystick)) {
            case IO.A_BUTTON:
                Robot.hatch.gripOpen(0.5f);
                break;
            case IO.B_BUTTON:
                Robot.hatch.gripClose(0.5f);
                break;
            case IO.X_BUTTON:
                Robot.hatch.armUp(0.35f);
                break;
            case IO.Y_BUTTON:
                Robot.hatch.armDown(0.25f);
                break;
            case IO.LB_BUTTON:
                Robot.cargo.intake(0.75f);
                break;
            case IO.RB_BUTTON:
                Robot.cargo.shoot(1f);
                break;
            case IO.R_TRIGGER_BUTTON:
                Robot.cargo.shoot(0.5f);
                break;
            case IO.L_STICK_BUTTON:
                Robot.ramp.rampMotorForward(0.4f);
                break;
            case IO.R_STICK_BUTTON:
                Robot.ramp.rampMotorReverse(0.4f);
                break;
            case IO.BACK_BUTTON:
                Robot.cargo.armUp(0.4f);
                break;
            case IO.START_BUTTON:
                Robot.cargo.armDown(0.4f);
                break;
            case IO.PAD:
                Robot.cargo.autoControl(Robot.io.shootJoystick.getPOV());
                break;
            default:
              Robot.cargo.stop();
              Robot.hatch.stop();
              Robot.ramp.stop();
          }
    }
}
