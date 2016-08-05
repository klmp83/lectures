package com.car.synergy;

public interface GasTank {

    public final String LOW_GAS_ON = "ON";
    public final String LOW_GAS_OFF = "OFF";
    public final double MAXIMUM_GASOLINE = 100; // liter

    public String getGasTankLevel(); // keep track of the gas level, "low gas" notification (off/on)
    public void insertGasoline(double liter); // 1 Liters per 1km
    public void useGasoline(double liter);
    public double getGasoline(); // liters
}
