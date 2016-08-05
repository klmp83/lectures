package com.car.synergy.init;

import com.car.synergy.Car;
import com.car.synergy.impl.*;

/**
 * this class CarFactory provides Car object.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public class CarFactory {

    /**
     * this method provides car object
     * @return car object
     */
    public Car createCar() {
        CarImpl car = new CarImpl();
        car.setBody(new BodyImpl());
        car.setEngine(new EngineImpl());
        car.setGasTank(new GasTankImpl());
        car.setTransmission(new TransmissionImpl());
        car.setTime(new TimeImpl());
        return car;
    }
}
