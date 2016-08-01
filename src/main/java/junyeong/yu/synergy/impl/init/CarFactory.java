package junyeong.yu.synergy.impl.init;

import junyeong.yu.synergy.Car;
import junyeong.yu.synergy.impl.BodyImpl;
import junyeong.yu.synergy.impl.CarImpl;
import junyeong.yu.synergy.impl.EngineImpl;
import junyeong.yu.synergy.impl.TimeImpl;
import junyeong.yu.synergy.impl.TransmissionImpl;

/**
 * Created by yujun-yeong on 16-07-31.
 */
public class CarFactory {
    public Car createCar() {
        CarImpl car = new CarImpl();
        car.setBody(new BodyImpl());
        car.setEngine(new EngineImpl());
        car.setTransmission(new TransmissionImpl());
        car.setTime(new TimeImpl());
        return car;
    }
}
