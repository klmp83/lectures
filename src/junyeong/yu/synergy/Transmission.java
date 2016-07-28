package junyeong.yu.synergy;

public interface Transmission {
	public void shiftGear(GearState gearState); // Neutral / Drive / Park / Reverse	
	public GearState getStateOfTransmission();  // Neutral / Drive / Park / Reverse
}