package com.car.synergy.impl.log;

import com.car.synergy.Car;
import com.car.synergy.GearState;

/**
 * This class CarLog defines/models the class of CarLog.
 * This class is to separate aspect of Car
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public class CarLog implements Car {

    private Car car; // the object of Car

    /**
     * This is a constructor for making CarLog
     * @param car to set the Car
     */
    public CarLog(Car car) {
        this.car = car;
    }

    /**
     * this method is the log starting the car
     */
    @Override
    public void startCar() {
        print("startCar()");
        car.startCar();
    }

    /**
     * this method is the log stopping the car
     */
    @Override
    public void stopCar() {
        print("stopCar()");
        car.stopCar();
    }

    /**
     * this method is the log turning on the engine
     */
    @Override
    public void turnOn() {
        print("turnOn()");
        car.turnOn();;
    }

    /**
     * this method is the log turning off the engine
     */
    @Override
    public void turnOff() {
        print("turnOff()");
        car.turnOff();
    }

    /**
     * this method is the log shifting gear on the transmission
     * @param gearState to set the GearState
     */
    @Override
    public void shiftGear(GearState gearState) {
        print("shiftGear(gearState)");
        car.shiftGear(gearState);
    }

    /**
     * This method is the log opening the door
     */
    @Override
    public void openDoor() {
        print("openDoor()");
        car.openDoor();
    }

    /**
     * This method is the log closing the door
     */
    @Override
    public void closeDoor() {
        print("closeDoor()");
        car.closeDoor();
    }

    /**
     * This method is the log calculating the time
     * @param millisecond to set the time
     */
    @Override
    public void elapsed(long millisecond) {
        print("elapsed(millisecond)");
        car.elapsed(millisecond);
    }

    /**
     * this method is the log pushing the accelerator
     */
    @Override
    public void pushAccelerator() {
        print("pushAccelerator()");
        car.pushAccelerator();
    }

    /**
     * this method is the log releasing the accelerator
     */
    @Override
    public void releaseAccelerator() {
        print("releaseAccelerator()");
        car.releaseAccelerator();
    }

    /**
     * this method is the log pushing the break
     */
    @Override
    public void pushBreaker() {
        print("pushBreaker()");
        car.pushBreaker();
    }

    /**
     * this method is the log releasing the break
     */
    @Override
    public void releaseBreaker() {
        print("releaseBreaker()");
        car.releaseBreaker();
    }

    /**
     * this method is the log putting the gas
     * @param liter to set the gas
     */
    @Override
    public void insertGasoline(double liter) {
        print("insertGasoline(liter)");
        car.insertGasoline(liter);
    }

    /**
     * this method is the log putting the oil
     */
    @Override
    public void insertOil() {
        print("insertOil()");
        car.insertOil();
    }

    /**
     * this method is the log getting the car state
     * @return current state of car
     */
    @Override
    public String getCarState() {
        print("getCarState()");
        return car.getCarState();
    }

    /**
     * this method is the log getting the engine state
     * @return current state of engine
     */
    @Override
    public String getEngineState() {
        print("getEngineState()");
        return car.getEngineState();
    }

    /**
     * this method is the log getting the oil state
     * @return current state of oil
     */
    @Override
    public String getOilLevel() {
        print("getOilLevel()");
        return car.getOilLevel();
    }

    /**
     * this method is the log getting the gas tank state
     * @return current state of gas tank
     */
    @Override
    public String getGasTankLevel() {
        print("getGasTankLevel()");
        return car.getGasTankLevel();
    }

    /**
     * this method is the log checking the door state
     * @return boolean value whether doors are open or not
     */
    @Override
    public boolean isOpenDoor() {
        print("isOpenDoor()");
        return car.isOpenDoor();
    }

    /**
     * this method is the log getting the transmission state
     * @return current state of transmission
     */
    @Override
    public GearState getStateOfTransmission() {
        print("getStateOfTransmission()");
        return car.getStateOfTransmission();
    }

    /**
     * this method is printing method
     */
    private void print(String str) {
        System.out.print(str + " : ");
    }
}
