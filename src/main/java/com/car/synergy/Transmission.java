package com.car.synergy;

public interface Transmission extends GearState {
	public GearState getGearStateNeutral();
    public GearState getGearStateDrive();
    public GearState getGearStatePark();
    public GearState getGearStateReverse();
    public GearState getStateOfTransmission();  // Neutral / Drive / Park / Reverse

    public void shiftGear(GearState gearState); // Neutral / Drive / Park / Reverse
}