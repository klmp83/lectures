package com.car.synergy;

/**
 * This interface Car defines/models overall Car action.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public interface Car {

	/* state components
	    Car: car state -> driving / stop
			Body: door state -> open / close
			Engine: engine state -> on / off
			GasTank: gas tank state -> depleted / available
			Transmission: GearState -> Neutral / Drive / Park / Reverse
    */

    /** this method is starting car */
	public void startCar(); // how about accelerating? --> (turn on key -> turn on engine -> check oil level (gas tank level)  -> shift gear to drive -> check door)
	/** this method is stopping car */
    public void stopCar(); // how about breaking? --> (breaking -> shift gear to neutral -> turn off engine)

    /** this method is turning on the engine */
	public void turnOn(); // by key
	/** this method is turning off the engine */
    public void turnOff(); // by key
    /**
     * this method is shifting gear
     * @param gearState to set gear
     */
	public void shiftGear(GearState gearState); // Neutral / Drive / Park / Reverse
	/** this method is opening the door */
    public void openDoor(); // check door before staring engine
	/** this method is closing the door */
    public void closeDoor();

    /**
     * this method is calculating the distance
     * @param millisecond to set the time
     */
    public void elapsed(long millisecond);

    /** this method is pushing accelerator */
	public void pushAccelerator();
    /** this method is releasing accelerator */
	public void releaseAccelerator();
    /** this method is pushing break */
    public void pushBreaker();
    /** this method is releasing break */
    public void releaseBreaker();

    /**
     * this method is putting gas
     * @param liter to set gas
     */
    public void insertGasoline(double liter); // 1 Liters per 1km
    /**
     * this method is putting oil
     */
    public void insertOil();

    /**
     * this method is getting state
     * @return current state of car
     */
	public String getCarState(); // moving / stop
    /**
     * this method is getting engine state
     * @return current state of engine
     */
    public String getEngineState(); // running / stop
	/**
     * this method is getting oil state
     * @return current state of oil
     */
    public String getOilLevel();
	/**
     * this method is getting gas tank state
     * @return current state of gas tank
     */
    public String getGasTankLevel(); // low gas on/off
	/**
     * this method is checking the door
     * @return boolean value whether doors are open or not
     */
    public boolean isOpenDoor(); // open / close
	/**
     * this method is getting transmission state
     * @return current state of transmission
     */
    public GearState getStateOfTransmission(); // Neutral / Drive / Park / Reverse
}