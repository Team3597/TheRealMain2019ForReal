/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Solenoid;

/**
 * Add your docs here.
 */
public class Ramp {
    
    private static Relay rampSolenoid;

    public Ramp() {
        rampSolenoid = new Relay(RobotMap.RAMP_SOLENOID_PORT);
    }

    public static void rampSolenoidOn() {
        rampSolenoid.set(Relay.Value.kOn);
    }

    public static void rampSolenoidOff() {
        rampSolenoid.set(Relay.Value.kOff);
    }
}
