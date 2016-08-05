package com.car.synergy.impl.gear;

/**
 * This class GearStatePark defines/models the class of GearStatePark.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public class GearStatePark extends GearStateBase {
    /**
     * This method is pushing accelerator
     */
    @Override
    public void pushAccelerator() {
        System.out.println("Accelerator does not work when gear is park");
    }

    /**
     * This method is pushing the break
     */
    @Override
    public void pushBreaker() {
        System.out.println("Car is already parked. However, to shift gear, breaker is used");
    }

    /**
     * This method is getting GearState
     * @return the gear state
     */
    @Override
    public String getGearState() {
        return "park";
    }
}
