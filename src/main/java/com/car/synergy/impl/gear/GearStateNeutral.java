package com.car.synergy.impl.gear;

/**
 * This class GearStateNeutral defines/models the class of GearStateNeutral.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public class GearStateNeutral extends GearStateBase {
    /**
     * This method is pushing accelerator
     */
    @Override
    public void pushAccelerator() {
        System.out.println("Accelerator does not work when gear is neutral");
    }

    /**
     * This method is getting GearState
     * @return the gear state
     */
    @Override
    public String getGearState() {
        return "neutral";
    }
}
