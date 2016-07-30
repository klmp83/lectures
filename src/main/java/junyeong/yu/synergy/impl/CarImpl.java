package junyeong.yu.synergy.impl;


import junyeong.yu.synergy.*;

// TODO : remove abstract & implement --> temporarily remain due to compile error
public class CarImpl implements Car {
	private Body body;
	private Engine engine;
	private GasTank gasTank;
	private Transmission transmission;

    private Time time;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    public void setTime(Time time) {
        this.time = time;
    }

    @Override
	public void startCar() { // preparation of car to move. not including moving.
        pushBreaker();
        shiftGear(this.transmission.getGearStateNeutral()); // or park
        releaseBreaker();
        turnOn();
		shiftGear(this.transmission.getGearStateDrive());
		//checkDoor();
		//pushAccelerator();
	}

    /*@Override
    public void moveCar() {
        pushAccelerator();
        releaseAccelerator();
        pushBreaker();
        releaseBreaker();
    }*/

    @Override
	public void stopCar() {
		pushBreaker();
		shiftGear(this.transmission.getGearStatePark());
        releaseBreaker();
		turnOff();
	}
	
	@Override
	public void turnOn() {
        engine.turnOn();

	}
	@Override
	public void turnOff() {
		engine.turnOff();
	}
	
	@Override
	public void shiftGear(GearState gearState) {
		transmission.shiftGear(gearState);
	}
	
	@Override
	public void openDoor() {
		body.openDoor();
	}
	@Override
	public void closeDoor() {
		body.closeDoor();
	}
	
	@Override
	public void pushAccelerator() {
		// TODO Auto-generated method stub
	}

    @Override
    public void releaseAccelerator() {
        // TODO Auto-generated method stub
    }

    @Override
	public void pushBreaker() {
		// TODO Auto-generated method stub
	}

    @Override
    public void releaseBreaker() {
        // TODO Auto-generated method stub
    }

    @Override
	public String getCarState() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getEngineState() {
		return engine.getEngineState();
	}
	@Override
	public String getOilLevel() {
		return engine.getOilLevel();
	}
	@Override
	public String getGasTankLevel() {
		return gasTank.getGasTankLevel();
	}
	@Override
	public String getStateOfDoor() {
		return body.getStateOfDoor();
	}
	@Override
	public GearState getStateOfTransmission() {
		return transmission.getStateOfTransmission();
	}

}
