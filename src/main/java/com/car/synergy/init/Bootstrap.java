package com.car.synergy.init;

import com.car.synergy.Car;
import com.car.synergy.GasTank;
import com.car.synergy.Time;
import com.car.synergy.impl.log.CarLog;
import com.car.synergy.time.CarTimeTrigger;
import com.car.synergy.ui.CarUIComponent;

/**
 * This class Bootstrap provides the entry point of Car program.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public class Bootstrap {

    /**
     * entry point of Car product
     * @param args this argument is assigned from outside
     */
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car car = new CarLog(factory.createCar()); // with log

        carProcessTerminal(car);
        carProcessUI(car);
    }

    private static void carProcessUI(Car car) {
        CarUIComponent carUIComponent = new CarUIComponent();
        carUIComponent.setCar(car);

        CarTimeTrigger carTimeTrigger = new CarTimeTrigger();
        carTimeTrigger.setCar(car);
        carTimeTrigger.startTrigger();

        //carTimeTrigger.stopTrigger();
    }

    private static void carProcessTerminal(Car car) {
        car.closeDoor();

        car.insertGasoline(60); // 11 liters
        car.insertOil();

        car.startCar();

        car.openDoor();
        car.pushAccelerator();
        car.pushAccelerator();
        car.closeDoor();
        car.pushAccelerator();
        car.elapsed(Time.HOUR); //twenty liter used - 40 liter left
        car.elapsed(Time.HOUR);
        car.elapsed(Time.HOUR);
        car.pushAccelerator();
        car.insertGasoline(6000000); // will not be inserted.
        car.insertGasoline(GasTank.MAXIMUM_GASOLINE);
        car.elapsed(Time.DAY); //40 is not enough for a day
        car.openDoor();
        car.pushBreaker();
        car.openDoor();
        car.pushBreaker();
        car.openDoor();

        car.stopCar();

        System.out.println();
        System.out.println("--- Current State of Car ---");
        System.out.println("Car State : " + car.getCarState());
        System.out.println("Engine State : " + car.getEngineState());
        System.out.println("Oil Level : " + car.getOilLevel());
        System.out.println("Gas Tank Alarm State : " + car.getGasTankLevel());
        System.out.println("State of Doors : " + (car.isOpenDoor() ? "open" : "close"));
        System.out.println("State of Transmission : " + car.getStateOfTransmission().getGearState());
    }
}
