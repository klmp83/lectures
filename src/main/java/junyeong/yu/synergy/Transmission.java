package junyeong.yu.synergy;

public interface Transmission {
	public void shiftGear(GearState gearState); // Neutral / Drive / Park / Reverse	
	public GearState getStateOfTransmission();  // Neutral / Drive / Park / Reverse

    public GearState getGearStateNeutral();
    public GearState getGearStateDrive();
    public GearState getGearStatePark();
    public GearState getGearStateReverse();
}