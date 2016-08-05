package com.car.synergy.impl.gear;

/**
 * Created by yujun-yeong on 16-07-28.
 */
public class GearStateNeutral extends GearStateBase {
    @Override
    public void pushAccelerator() {
        System.out.println("Accelerator does not work when gear is neutral");
    }

    @Override
    public String getGearState() {
        return "neutral";
    }
}