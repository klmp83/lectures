package junyeong.yu.synergy.impl;


import junyeong.yu.synergy.*;

// TODO : remove abstract & implement --> temporarily remain due to compile error
public class CarImpl implements Car {
	private Body body;
	private Engine engine;
	private GasTank gasTank;
	private Transmission transmission;
	private int elapsedTime;
	
	@Override
	public void startCar() {
		turnOn();
		//checkOilLevel();
		shiftGear(null);
		//checkDoor();
		accelerating();
	}
	
	@Override
	public void stopCar() {
		breaking();
		shiftGear(null);
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
	public void accelerating() {
		// TODO Auto-generated method stub
	}
	@Override
	public void breaking() {
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
