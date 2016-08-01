package junyeong.yu.synergy.impl.init;

import junyeong.yu.synergy.Car;
import junyeong.yu.synergy.impl.BodyImpl;
import junyeong.yu.synergy.impl.CarImpl;
import junyeong.yu.synergy.impl.EngineImpl;
import junyeong.yu.synergy.impl.TimeImpl;
import junyeong.yu.synergy.impl.log.CarLog;
import junyeong.yu.synergy.impl.transmission.TransmissionImpl;

/**
 * Created by yujun-yeong on 16-07-28.
 */
public class Bootstrap {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car car = new CarLog(factory.createCar()); // with log

        car.closeDoor();
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
