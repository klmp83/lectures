package com.car.synergy;

/**
 * This interface GearState defines/models the interface of GearState.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public interface GearState {

    /**
     * This method is pushing accelerator
     */
    public void pushAccelerator();
    /**
     * This method is pushing break
     */
    public void pushBreaker();

    /**
     * This method is setting the time
     * @param time to set the time
     */
    public void setTime(Time time);

    /**
     * This method is getting GearState
     * @return the gear state
     */
    public String getGearState();
}
