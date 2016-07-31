package junyeong.yu.synergy.impl.init;

import junyeong.yu.synergy.Car;
import junyeong.yu.synergy.impl.BodyImpl;
import junyeong.yu.synergy.impl.CarImpl;
import junyeong.yu.synergy.impl.EngineImpl;
import junyeong.yu.synergy.impl.TimeImpl;
import junyeong.yu.synergy.impl.transmission.TransmissionImpl;

/**
 * Created by yujun-yeong on 16-07-28.
 */
public class Bootstrap {
    public static void main(String[] args) {
        CarImpl car = new CarImpl();
        car.setBody(new BodyImpl());
        car.setEngine(new EngineImpl());
        car.setTransmission(new TransmissionImpl());
        car.setTime(new TimeImpl());

        car.closeDoor();
        //car.shiftGear(car.getTransmission().getGearStateDrive());
        //car.pushAccelerator();

        car.startCar();

        car.openDoor();
        car.pushAccelerator();
        car.pushAccelerator();
        car.closeDoor();
        car.pushAccelerator();
        car.pushAccelerator();
        car.openDoor();
        car.pushBreaker();
        car.openDoor();
        car.pushBreaker();
        car.openDoor();

        car.stopCar();
    }
}
