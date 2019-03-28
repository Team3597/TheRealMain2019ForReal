/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Spark;

import edu.wpi.first.wpilibj.AnalogPotentiometer;

public class Cargo {

    private static WPI_TalonSRX rIntakeMotor;
    private static WPI_TalonSRX lIntakeMotor;
    private static Spark cargoArm;

    float potSet;

    AnalogPotentiometer pot = new AnalogPotentiometer(0);

    public Cargo() {

        rIntakeMotor = new WPI_TalonSRX(RobotMap.R_INTAKE_MOTOR_PORT);
        lIntakeMotor = new WPI_TalonSRX(RobotMap.L_INTAKE_MOTOR_PORT);

        rIntakeMotor.setInverted(RobotMap.R_INTAKE_INVERTED);
        lIntakeMotor.setInverted(RobotMap.L_INTAKE_INVERTED);

        lIntakeMotor.follow(rIntakeMotor);

        cargoArm = new Spark(RobotMap.CARGO_ARM_MOTOR_PORT);
        cargoArm.setInverted(RobotMap.CARGO_ARM_INVERTED);

        potSet = -1;

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

    public void autoControl(float pHatData) {
        switch((int)pHatData){
            case 0:
                potSet = 0.5f;
                break;
            case 90:
                potSet = 0.55f;
                break;
            case 180:
                potSet = 0.76f;
                break;
            case 270:
                potSet = -1;
                break;
            default:
                break;

        }
    }

    public void driveSetpoint() {
        if(Robot.cargo.potSet > -1){
            double midSet = (potSet-pot.get())*5;
            if(midSet > 0.75){
                midSet = 0.75;
            }
            if(midSet < -0.75){
                midSet = -0.75;
            }
            cargoArm.set(midSet);
        } 
        System.out.println(pot.get());
    }
    
}
