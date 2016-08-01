package junyeong.yu.synergy.impl;


import junyeong.yu.synergy.*;

// TODO : remove abstract & implement --> temporarily remain due to compile error
public class CarImpl implements Car {
	private Body body;
	private Engine engine;
	private GasTank gasTank;
	private Transmission transmission;

    private Time time;

    public void setBody(Body body) {
        this.body = body;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setTime(Time time) {
        this.time = time;
        transmission.setTime(time);
    }

    public Transmission getTransmission() {
        return this.transmission;
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
        if (time.getCurrentSpeed() > 0) {
            System.out.println("Car is moving, so You cannot open doors. Current speed : " + time.getCurrentSpeed() + " km/hour");
            return;
        }
		this.body.openDoor();
	}
	@Override
	public void closeDoor() {
		this.body.closeDoor();
	}

    @Override
    public void elapsed(long millisecond) {
        this.time.elapsed(millisecond);
    }

    @Override
	public void pushAccelerator() {
        if (this.body.isOpenDoor()) {
            System.out.println("Doors are open now. Please close doors.");
            return;
        }
        this.transmission.pushAccelerator();
	}

    @Override
    public void releaseAccelerator() {
        System.out.println("Accelerator is released");
    }

    @Override
	public void pushBreaker() {
        this.transmission.pushBreaker();
	}

    @Override
    public void releaseBreaker() {
        System.out.println("Breaker is released");
    }

    @Override
	public String getCarState() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getEngineState() {
		return this.engine.getEngineState();
	}
	@Override
	public String getOilLevel() {
		return this.engine.getOilLevel();
	}
	@Override
	public String getGasTankLevel() {
		return this.gasTank.getGasTankLevel();
	}
	@Override
	public boolean isOpenDoor() {
        return this.body.isOpenDoor();
	}
	@Override
	public GearState getStateOfTransmission() {
		return this.transmission.getStateOfTransmission();
	}
}
