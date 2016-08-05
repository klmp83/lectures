package com.car.synergy.impl.gear;

import com.car.synergy.GearState;
import com.car.synergy.Time;

/**
 * This class GearStateBase defines/models the abstract class of GearStateBase.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
abstract public class GearStateBase implements GearState {

    protected Time time; //time object reflected the time for car

    /**
     * This method is setting the time
     * @param time to set the time
     */
    @Override
    public void setTime(Time time) {
        this.time = time;
    }
    /**
     * This method is pushing the break
     */
    @Override
    public void pushBreaker() {
        if (time.getCurrentSpeed() == 0) {
            System.out.println("Car is already stopped. Breaking is useless.");
            return;
        }
        time.speedDown(Time.BREAKER_SPEED_UNIT);
        System.out.println("Car speed is decreased. Current speed is " + time.getCurrentSpeed() + " km/hour");
    }
}
