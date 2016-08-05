package junyeong.yu.synergy;

public interface Car {
	
	// state components 
	// Car: car state -> driving / stop
	//		Body: door state -> open / close
	//		Engine: engine state -> on / off
	//		(?)GasTank: gas tank state -> depleted / available (??consider??)
	//		Transmission: GearState -> Neutral / Drive / Park / Reverse
	
	// abstract concept --> facade concept --> need to move car facade
	public void startCar(); // how about accelerating? --> (turn on key -> turn on engine -> check oil level (gas tank level)  -> shift gear to drive -> check door)
	//public void moveCar(); // --> DELETE because it is not function but state
    public void stopCar(); // how about breaking? --> (breaking -> shift gear to neutral -> turn off engine)
	
	public void turnOn(); // by key
	public void turnOff(); // by key
	public void shiftGear(GearState gearState); // Neutral / Drive / Park / Reverse
	public void openDoor(); // check door before staring engine
	public void closeDoor();

    public void elapsed(long millisecond);

	public void pushAccelerator();
	public void releaseAccelerator();
    public void pushBreaker();
    public void releaseBreaker();

    public void insertGasoline(double liter); // 1 Liters per 1km
    public void insertOil();

	public String getCarState(); // moving / stop
	public String getEngineState(); // running / stop
	public String getOilLevel();
	public String getGasTankLevel(); // low gas on/off
	public boolean isOpenDoor(); // open / close
	public GearState getStateOfTransmission(); // Neutral / Drive / Park / Reverse
}