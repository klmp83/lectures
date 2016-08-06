package com.car.synergy;

/**
 * This interface Engine defines/models the interface of Engine.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public interface Engine {

    public final static String ENGINE_STATE_RUNNING = "running"; //running state of engine
    public final static String ENGINE_STATE_STOP = "stop"; //stop state of engine

	/**
	 * this method is turing on engine
	 */
	public void turnOn();
	/**
	 * this method is turing off engine
	 */
    public void turnOff();

	/**
	 * this method is putting oil
	 */
    public void insertOil();

	/**
	 * this method is checking oil state
     * @return current oil level
	 */
	public String getOilLevel(); // ok / not ok

	/**
	 * this method is checking engine state
     * @return current engine state
	 */
	public String getEngineState(); // running / stop
}
