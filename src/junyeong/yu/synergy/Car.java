package junyeong.yu.synergy;

public interface Car {
	
	// state components 
	// Car: car state -> driving / stop
	//		Body: door state -> open / close
	//		Engine: engine state -> on / off
	//		(?)GasTank: gas tank state -> depleted / available (??consider??)
	//		Transmission: GearState -> Neutral / Drive / Park / Reverse
	
	// abstract concept --> facade concept --> need to move car facade
	public void startCar(); // how about accelerating? --> (turn on key -> turn on engine -> check oil level (gas tank level)  -> shift gear to drive -> check door -> accelerating)
	public void stopCar(); // how about breaking? --> (breaking -> shift gear to neutral -> turn off engine)	
	
	public void turnOn(); // by key
	public void turnOff(); // by key
	public void shiftGear(GearState gearState); // Neutral / Drive / Park / Reverse
	public void openDoor(); // check door before staring engine
	public void closeDoor();
	
	public void accelerating(); // by Junyeong
	public void breaking(); // by Junyeong
	
	// TODO : below return types should be changed to proper types
	public String getCarState(); // moving / stop
	public String getEngineState(); // running / stop
	public String getOilLevel();
	public String getGasTankLevel();
	public String getStateOfDoor(); // open / close
	public GearState getStateOfTransmission(); // Neutral / Drive / Park / Reverse
	
	// Question one: What is diffeneces between oil level and gas tank level?
	// Question two: Is it ok not to add accelerating & breaking?
}