package junyeong.yu.synergy.impl;

import junyeong.yu.synergy.GasTank;
import junyeong.yu.synergy.exception.GasTankException;

/**
 * Created by yujun-yeong on 16-08-05.
 */
public class GasTankImpl implements GasTank {

    private double currentGasoline = 0; // liter

    @Override
    public String getGasTankLevel() {
        return GasTank.MAXIMUM_GASOLINE / 10 < this.currentGasoline ?  GasTank.LOW_GAS_OFF : GasTank.LOW_GAS_ON;
    }

    @Override
    public void insertGasoline(double liter) {
        if (currentGasoline + liter > GasTank.MAXIMUM_GASOLINE) {
            System.out.println("Gasoline can not be inserted more than gasoline tank limitation.");
            return;
        }
        currentGasoline += liter;
        System.out.println("Gasoline is inserted up to " + liter + " liter.");
    }

    @Override
    public void useGasoline(double liter) {
        if (liter > currentGasoline) {
            throw new GasTankException("Current gasoline is not enough to use.");
        }
        currentGasoline -= liter;
    }

    @Override
    public double getGasoline() {
        return this.currentGasoline;
    }
}