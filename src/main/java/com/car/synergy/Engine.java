package com.car.synergy;

public interface Engine {

    public final static String ENGINE_STATE_RUNNING = "running";
    public final static String ENGINE_STATE_STOP = "stop";

	public void turnOn();
    public void turnOff();

    public void insertOil();
	
	public String getOilLevel(); // ok / not ok
	public String getEngineState(); // running / stop
}
