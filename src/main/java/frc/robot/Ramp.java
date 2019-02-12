/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Spark;

/**
 * Add your docs here.
 */
public class Ramp {
    
    private static Spark rampMotor;

    public Ramp() {
        rampMotor = new Spark(RobotMap.RAMP_MOTOR_PORT);

        rampMotor.setInverted(RobotMap.RAMP_INVERTED);
    }

    public static void rampMotorForward(float pSpeed) {
        rampMotor.set(pSpeed);
    }

    public static void rampMotorReverse(float pSpeed) {
        rampMotor.set(-pSpeed);
    }

    public static void stop() {
        rampMotor.set(0f);
    }
}
