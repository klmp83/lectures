package com.car.synergy;
/**
 * This interface GasTank defines/models the interface of GasTank.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public interface GasTank {

    public final String LOW_GAS_ON = "ON"; //gas tank state when gas tank state is ok
    public final String LOW_GAS_OFF = "OFF"; //gas tank state when gas tank state is low level
    public final double MAXIMUM_GASOLINE = 100; // liter

    /**
	 * this method is checking gas tank level
	 */
    public String getGasTankLevel(); // keep track of the gas level, "low gas" notification (off/on)

    /**
	 * this method is putting gas
     * @param liter to set gas put
	 */
    public void insertGasoline(double liter); // 1 Liters per 1km

    /**
	 * this method is using gas
     * @param liter to set gas used
	 */
    public void useGasoline(double liter);

    /**
	 * this method is getting gas level
     * @return gas current state
	 */
    public double getGasoline(); // liters
}
