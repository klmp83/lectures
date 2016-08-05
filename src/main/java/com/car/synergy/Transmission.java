package com.car.synergy;
/**
 * This interface Transmission defines/models the interface of Transmission.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public interface Transmission extends GearState {
	/**
	 * this method is making object for GearStateNeutral
	 */
	public GearState getGearStateNeutral();

	/**
	 * this method is making object for GearStateDrive
	 */
    public GearState getGearStateDrive();

	/**
	 * this method is making object for GearStatePark
	 */
    public GearState getGearStatePark();

	/**
	 * this method is making object for GearStateReverse
	 */
    public GearState getGearStateReverse();

	/**
	 * this method is getting gear state
	 */
    public GearState getStateOfTransmission();  // Neutral / Drive / Park / Reverse

	/**
	 * this method is setting gear state
	 * @param gearState to set gear
	 */
    public void shiftGear(GearState gearState); // Neutral / Drive / Park / Reverse
}
