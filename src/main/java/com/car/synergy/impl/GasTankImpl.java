package com.car.synergy.impl;

import com.car.synergy.GasTank;
import com.car.synergy.exception.GasTankException;

/**
 * This class GasTankImpl defines/models the interface of GasTank.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public class GasTankImpl implements GasTank {

    private double currentGasoline = 0; // current gas initializing

	/**
	 * this method is checking gas tank level
     * @return gas tank checking value
	 */
    @Override
    public String getGasTankLevel() {
        return GasTank.MAXIMUM_GASOLINE / 10 < this.currentGasoline ?  GasTank.LOW_GAS_OFF : GasTank.LOW_GAS_ON;
    }

	/**
	 * this method is putting gas
	 * @param liter to set gas put
	 */
    @Override
    public void insertGasoline(double liter) {
        if (currentGasoline + liter > GasTank.MAXIMUM_GASOLINE) {
            System.out.println("Gasoline can not be inserted more than gasoline tank limitation.");
            return;
        }
        currentGasoline += liter;
        System.out.println("Gasoline is inserted up to " + liter + " liter.");
    }

	/**
	 * this method is using gas
	 * @param liter to set gas used
	 */
    @Override
    public void useGasoline(double liter) {
        if (liter > currentGasoline) {
            throw new GasTankException("Current gasoline is not enough to use.");
        }
        currentGasoline -= liter;
    }

	/**
	 * this method is checking current gas
     * @return current gas 
	 */
    @Override
    public double getGasoline() {
        return this.currentGasoline;
    }
}
