package com.car.synergy.impl.gear;

import com.car.synergy.Time;

/**
 * This class GearStateDrive defines/models the class of GearStateDrive.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public class GearStateDrive extends GearStateBase {
    /**
     * This method is pushing accelerator
     */
    @Override
    public void pushAccelerator() {
        time.speedUp(Time.ACCELERATOR_SPEED_UNIT);
        System.out.println("Car is moving forward. Current speed is " + time.getCurrentSpeed() + "km/hour");
    }

    /**
     * This method is getting GearState
     * @return the gear state
     */
    @Override
    public String getGearState() {
        return "drive";
    }
}
