/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Spark;

/**
 * Add your docs here.
 */
public class Hatch {

    private static Spark hatchArm;
    private static Spark hatchGrip;

    public Hatch() {

        hatchArm = new Spark(RobotMap.HATCH_ARM_MOTOR_PORT);
        hatchGrip = new Spark(RobotMap.HATCH_GRIP_MOTOR_PORT);

        hatchArm.setInverted(RobotMap.HATCH_ARM_INVERTED);
        hatchGrip.setInverted(RobotMap.HATCH_GRIPPER_INVERTED);

    }

    public static void armUp(float pSpeed) {
        hatchArm.set(pSpeed);
    }

    public static void armDown(float pSpeed) {
        hatchArm.set(-pSpeed);
    }

    public static void gripOpen(float pSpeed) {
        hatchGrip.set(pSpeed);
    }

    public static void gripClose(float pSpeed) {
        hatchGrip.set(-pSpeed);
    }

    public static void stop() {
        Robot.hatch.armUp(0f);
        Robot.hatch.gripOpen(0f);
    }

}
