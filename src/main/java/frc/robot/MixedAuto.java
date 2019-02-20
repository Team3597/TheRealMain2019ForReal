/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

public class MixedAuto {

  public static void alignHatchPortal() {
  
    float x = Robot.limeLight.limeLightGetX();
              
    if(Robot.limeLight.limeLightTargetFound()) {
      Robot.driveTrain.drive = false;

      if(x <= 2f) {
        Robot.driveTrain.driveArcade(-0.5f, 0f);
      } else if(x > 2f) {
        Robot.driveTrain.driveArcade(0.5f, 0f);
      }

    }
  }

  public static void stop() {
    Robot.driveTrain.drive = true;
  }
  
}
