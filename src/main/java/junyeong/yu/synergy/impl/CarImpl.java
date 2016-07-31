package junyeong.yu.synergy.impl;


import junyeong.yu.synergy.*;

// TODO : remove abstract & implement --> temporarily remain due to compile error
public class CarImpl implements Car {
	private Body body;
	private Engine engine;
	private GasTank gasTank;
	private Transmission transmission;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setTime(Time time) {
        transmission.setTime(time);
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

    @Override
	public void stopCar() {
		pushBreaker();
		shiftGear(this.transmission.getGearStatePark());
        releaseBreaker();
		turnOff();
	}
	
	@Override
	public void turnOn() {
        this.engine.turnOn();

	}
	@Override
	public void turnOff() {
		this.engine.turnOff();
	}
	
	@Override
	public void shiftGear(GearState gearState) {
		this.transmission.shiftGear(gearState);
	}
	
	@Override
	public void openDoor() {
		this.body.openDoor();
	}
	@Override
	public void closeDoor() {
		this.body.closeDoor();
	}
	
	@Override
	public void pushAccelerator() {
        this.transmission.pushAccelerator();
	}

    @Override
    public void releaseAccelerator() {
        // TODO Auto-generated method stub
    }

    @Override
	public void pushBreaker() {
        //time.speedDown(Time.BREAKER_SPEED_UNIT);
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
	public boolean isOpenDoor() {
        return body.isOpenDoor();
	}
	@Override
	public GearState getStateOfTransmission() {
		return transmission.getStateOfTransmission();
	}

}
