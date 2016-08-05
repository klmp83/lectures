package com.car.synergy.impl.gear;

import com.car.synergy.Time;

/**
 * Created by yujun-yeong on 16-07-28.
 */
public class GearStateDrive extends GearStateBase {
    @Override
    public void pushAccelerator() {
        time.speedUp(Time.ACCELERATOR_SPEED_UNIT);
        System.out.println("Car is moving forward. Current speed is " + time.getCurrentSpeed() + "km/hour");
    }

    @Override
    public String getGearState() {
        return "drive";
    }
}
