package com.car.synergy.impl;


import com.car.synergy.*;
import com.car.synergy.exception.CarException;

/**
 * this class CarImpl defines/models the interface of Car.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public class CarImpl implements Car {
	private Body body; //body object of car
	private Engine engine; // engine object of car
	private GasTank gasTank; // gas tank object of car
	private Transmission transmission; // transmission of car

    private Time time; // time of car used

    /**
     * this method is setting the body
     * @param body to set the body
     */
    public void setBody(Body body) {
        this.body = body;
    }

    /**
     * this method is setting the engine
     * @param engine to set the engine
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /**
     * this method is setting gas tank
     * @param gasTank to set gas tank
     */
    public void setGasTank(GasTank gasTank) {
        this.gasTank = gasTank;
    }

    /**
     * this method is setting transmission
     * @param transmission to set the transmission
     */
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    /**
     * this method is setting time
     * @param time to set the time
     */
    public void setTime(Time time) {
        this.time = time;
        transmission.setTime(time);
    }

    /**
     * this method is starting car
     */
    @Override
	public void startCar() { // preparation of car to move. not including moving.
        pushBreaker();
        shiftGear(this.transmission.getGearStateNeutral()); // or park
        releaseBreaker();
        turnOn();
		shiftGear(this.transmission.getGearStateDrive());
	}

    /**
     * this method is stopping car
     */
    @Override
	public void stopCar() {
		pushBreaker();
		shiftGear(this.transmission.getGearStatePark());
        releaseBreaker();
		turnOff();
	}

    /**
     * this method is turning on the engine
     */
	@Override
	public void turnOn() {
        this.engine.turnOn();
	}

    /**
     * this method is turning off the engine
     */
	@Override
	public void turnOff() {
		this.engine.turnOff();
	}

    /**
     * this method is shifting gear
     * @param gearState to set gear
     */
	@Override
	public void shiftGear(GearState gearState) {
		this.transmission.shiftGear(gearState);
	}

    /**
     * this method is opening the door
     */
	@Override
	public void openDoor() {
        if (time.getCurrentSpeed() > 0) {
            System.out.println("Car is moving, so You cannot open doors. Current speed : " + time.getCurrentSpeed() + " km/hour");
            return;
        }
		this.body.openDoor();
	}

    /**
     * this method is closing the door
     */
	@Override
	public void closeDoor() {
		this.body.closeDoor();
	}

    /**
     * this method is calculating the distance
     * @param millisecond to set the time
     */
    @Override
    public void elapsed(long millisecond) {
        double movedMilege = this.time.getEstimatedMileage(millisecond);

        try {
            // 1 liter per kilometer
            this.gasTank.useGasoline(movedMilege);
            this.time.elapsed(millisecond);
            if (GasTank.LOW_GAS_ON.equals(this.gasTank.getGasTankLevel())) {
                System.out.println("Current gasoline is below 10% of gasoline maximum gas level.");
            }
        } catch (CarException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * this method is pushing accelerator
     */
    @Override
	public void pushAccelerator() {
        if (this.body.isOpenDoor()) {
            System.out.println("Doors are open now. Please close doors.");
            return;
        }
        this.transmission.pushAccelerator();
	}

    /**
     * this method is releasing accelerator
     */
    @Override
    public void releaseAccelerator() {
        System.out.println("Accelerator is released");
    }

    /**
     * this method is pushing break
     */
    @Override
	public void pushBreaker() {
        this.transmission.pushBreaker();
	}

    /**
     * this method is releasing break
     */
    @Override
    public void releaseBreaker() {
        System.out.println("Breaker is released");
    }

    /**
     * this method is putting gas
     * @param liter to set gas
     */
    @Override
    public void insertGasoline(double liter) {
        this.gasTank.insertGasoline(liter);
    }

    /**
     * this method is putting oil
     */
    @Override
    public void insertOil() {
        this.engine.insertOil();
    }

    /**
     * this method is getting state
     * @return current state of car
     */
    @Override
	public String getCarState() {
        if (Engine.ENGINE_STATE_RUNNING.equals(engine.getEngineState())) {
            return "moving";
        }
		return "stop";
	}

    /**
     * this method is getting engine state
     * @return current state of engine
     */
	@Override
	public String getEngineState() {
		return this.engine.getEngineState();
	}

    /**
     * this method is getting oil state
     * @return current state of oil
     */
	@Override
	public String getOilLevel() {
		return this.engine.getOilLevel();
	}

    /**
     * this method is getting gas tank state
     * @return current state of gas tank
     */
	@Override
	public String getGasTankLevel() {
		return this.gasTank.getGasTankLevel();
	}

    /**
     * this method is checking the door
     * @return boolean value whether doors are open or not
     */
	@Override
	public boolean isOpenDoor() {
        return this.body.isOpenDoor();
	}

    /**
     * this method is getting transmission state
     * @return current state of transmission
     */
	@Override
	public GearState getStateOfTransmission() {
		return this.transmission.getStateOfTransmission();
	}
}
