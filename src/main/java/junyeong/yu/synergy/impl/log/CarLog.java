package junyeong.yu.synergy.impl.log;

import junyeong.yu.synergy.Car;
import junyeong.yu.synergy.GearState;

/**
 * Created by yujun-yeong on 16-07-31.
 */
public class CarLog implements Car {

    private Car car;

    public CarLog(Car car) {
        this.car = car;
    }

    @Override
    public void startCar() {
        print("startCar()");
        car.startCar();
    }

    @Override
    public void stopCar() {
        print("stopCar()");
        car.stopCar();
    }

    @Override
    public void turnOn() {
        print("turnOn()");
        car.turnOn();;
    }

    @Override
    public void turnOff() {
        print("turnOff()");
        car.turnOff();
    }

    @Override
    public void shiftGear(GearState gearState) {
        print("shiftGear(gearState)");
        car.shiftGear(gearState);
    }

    @Override
    public void openDoor() {
        print("openDoor()");
        car.openDoor();
    }

    @Override
    public void closeDoor() {
        print("closeDoor()");
        car.closeDoor();
    }

    @Override
    public void elapsed(long millisecond) {
        print("elapsed(millisecond)");
        car.elapsed(millisecond);
    }

    @Override
    public void pushAccelerator() {
        print("pushAccelerator()");
        car.pushAccelerator();
    }

    @Override
    public void releaseAccelerator() {
        print("releaseAccelerator()");
        car.releaseAccelerator();
    }

    @Override
    public void pushBreaker() {
        print("pushBreaker()");
        car.pushBreaker();
    }

    @Override
    public void releaseBreaker() {
        print("releaseBreaker()");
        car.releaseBreaker();
    }

    @Override
    public void insertGasoline(double liter) {
        print("insertGasoline(liter)");
        car.insertGasoline(liter);
    }

    @Override
    public void insertOil() {
        print("insertOil()");
        car.insertOil();
    }

    @Override
    public String getCarState() {
        print("getCarState()");
        return car.getCarState();
    }

    @Override
    public String getEngineState() {
        print("getEngineState()");
        return car.getEngineState();
    }

    @Override
    public String getOilLevel() {
        print("getOilLevel()");
        return car.getOilLevel();
    }

    @Override
    public String getGasTankLevel() {
        print("getGasTankLevel()");
        return car.getGasTankLevel();
    }

    @Override
    public boolean isOpenDoor() {
        print("isOpenDoor()");
        return car.isOpenDoor();
    }

    @Override
    public GearState getStateOfTransmission() {
        print("getStateOfTransmission()");
        return car.getStateOfTransmission();
    }

    private void print(String str) {
        System.out.print(str + " : ");
    }
}
