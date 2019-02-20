/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

/**
 * Add your docs here.
 */
public class LimeLight {

    private NetworkTable limeLightTable;

    public LimeLight() {
        limeLightTable = NetworkTableInstance.getDefault().getTable("limelight");
    }

    public float limeLightGetX() {
        NetworkTableEntry tx = limeLightTable.getEntry("tx");
        float x = (float) tx.getDouble(0d);
        return x;
      }
    
    public float limeLightGetY() {
        NetworkTableEntry ty = limeLightTable.getEntry("ty");
        float y = (float) ty.getDouble(0d);
        return y;
    }
    
    public float limeLightGetL() {
        NetworkTableEntry tl = limeLightTable.getEntry("tl");
        float l = (float) tl.getDouble(0d);
        return l;
    }
    
    public float limeLightGetArea() {
        NetworkTableEntry ta = limeLightTable.getEntry("ta");
        float a = (float) ta.getDouble(0d);
        return a;
    }
    
    public boolean limeLightTargetFound() {
        NetworkTableEntry tv = limeLightTable.getEntry("tv");
        double v = tv.getDouble(0d);
        if (v == 0d) {
          return false;
        } else {
          return true;
        }
    }
    
    public void limeLightSetPipeline(int pPipeline) {
        if (pPipeline >= 0 && pPipeline <= 9) {
          limeLightTable.getEntry("pipeline").setValue(pPipeline);
          System.out.println(limeLightTable.getEntry("pipeline").getDouble(0d));
        }
    }

}
