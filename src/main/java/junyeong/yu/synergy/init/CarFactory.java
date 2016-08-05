package junyeong.yu.synergy.init;

import junyeong.yu.synergy.Car;
import junyeong.yu.synergy.impl.*;

/**
 * Created by yujun-yeong on 16-07-31.
 */
public class CarFactory {
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
