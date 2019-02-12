/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Spark;

public class Cargo {

    private static WPI_TalonSRX rIntakeMotor;
    private static WPI_TalonSRX lIntakeMotor;
    private static Spark cargoArm;

    public Cargo() {

        rIntakeMotor = new WPI_TalonSRX(RobotMap.R_INTAKE_MOTOR_PORT);
        lIntakeMotor = new WPI_TalonSRX(RobotMap.L_INTAKE_MOTOR_PORT);

        rIntakeMotor.setInverted(RobotMap.R_INTAKE_INVERTED);
        lIntakeMotor.setInverted(RobotMap.L_INTAKE_INVERTED);

        lIntakeMotor.follow(rIntakeMotor);

        cargoArm = new Spark(RobotMap.CARGO_ARM_MOTOR_PORT);
        cargoArm.setInverted(RobotMap.CARGO_ARM_INVERTED);
    }

    public static void intake(float pSpeed) {
        rIntakeMotor.set(pSpeed);
    }

    public static void shoot(float pSpeed) {
        rIntakeMotor.set(-pSpeed);
    }

    public static void armUp(float pSpeed) {
        cargoArm.set(pSpeed);
    }

    public static void armDown(float pSpeed) {
        cargoArm.set(-pSpeed);
    }

    public static void stop() {
        Robot.cargo.intake(0f);
        Robot.cargo.armUp(0f);
    }
}
