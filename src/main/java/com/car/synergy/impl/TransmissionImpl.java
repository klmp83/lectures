package com.car.synergy.impl;

import com.car.synergy.GearState;
import com.car.synergy.Time;
import com.car.synergy.Transmission;
import com.car.synergy.impl.gear.GearStateDrive;
import com.car.synergy.impl.gear.GearStateNeutral;
import com.car.synergy.impl.gear.GearStatePark;
import com.car.synergy.impl.gear.GearStateReverse;

/**
 * This class TransmissionImpl defines/models the interface of Transmission.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public class TransmissionImpl implements Transmission {

	/**
	 * this method is making object for GearStatePark
	 */
    private GearState gearStatePark = new GearStatePark();
	/**
	 * this method is making object for GearStateNeutral
	 */
    private GearState gearStateNeutral = new GearStateNeutral();
	/**
	 * this method is making object for GearStateDrive
	 */
    private GearState gearStateDrive = new GearStateDrive();
	/**
	 * this method is making object for GearStateReverse
	 */
    private GearState gearStateReverse = new GearStateReverse();
	/**
	 * this method is setting current state as park
	 */
    private GearState currentGearState = gearStatePark;

	/**
	 * this method is setting the time
	 * @param time to set time
	 */
    @Override
    public void setTime(Time time) {
        this.gearStatePark.setTime(time);
        this.gearStateNeutral.setTime(time);
        this.gearStateDrive.setTime(time);
        this.gearStateReverse.setTime(time);
    }

	/**
	 * this method is getting gear state
	 * @return current gear state
	 */
    @Override
    public String getGearState() {
        return this.currentGearState.getGearState();
    }

	/**
	 * this method is pushing accelerator
	 */
    @Override
    public void pushAccelerator() {
        currentGearState.pushAccelerator();
    }

	/**
	 * this method is pushing break
	 */
    @Override
    public void pushBreaker() {
        currentGearState.pushBreaker();
    }

	/**
	 * this method is getting neutral gear object
	 * @return gearStateNeutral
	 */
    @Override
    public GearState getGearStateNeutral() {
        return gearStateNeutral;
    }

	/**
	 * this method is getting drive gear object
	 * @return gearStateDrive
	 */
    @Override
    public GearState getGearStateDrive() {
        return gearStateDrive;
    }

	/**
	 * this method is getting park gear object
	 * @return gearStatePark
	 */
    @Override
    public GearState getGearStatePark() {
        return gearStatePark;
    }

	/**
	 * this method is getting reverse gear object
	 * @return gearStateReverse
	 */
    @Override
    public GearState getGearStateReverse() {
        return gearStateReverse;
    }

	/**
	 * this method is getting current gear state object
	 * @return currentGearState
	 */
    @Override
    public GearState getStateOfTransmission() {
        return this.currentGearState;
    }

	/**
	 * this method is setting gear
	 * @param gearState to set gear
	 */
    @Override
    public void shiftGear(GearState gearState) {
        this.currentGearState = gearState;
    }
}
