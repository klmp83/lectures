package junyeong.yu.synergy.init;

import junyeong.yu.synergy.Car;
import junyeong.yu.synergy.GasTank;
import junyeong.yu.synergy.GearState;
import junyeong.yu.synergy.Time;
import junyeong.yu.synergy.impl.log.CarLog;

/**
 * Created by yujun-yeong on 16-07-28.
 */
public class Bootstrap {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car car = new CarLog(factory.createCar()); // with log

        car.closeDoor();
        //car.pushAccelerator();

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


        // Developed Function
        /*
        public void startCar();
        public void stopCar();
        public void turnOn();
        public void turnOff();
        public void shiftGear(GearState gearState);
        public void openDoor();
        public void closeDoor();
        public void elapsed(long millisecond);
        public void pushAccelerator();
        public void releaseAccelerator();
        public void pushBreaker();
        public void releaseBreaker();
        */

        // TODO : NEED TO DEVELOP
        /*
        public String getCarState(); // moving / stop
        public String getEngineState(); // running / stop
        public String getOilLevel();
        public String getGasTankLevel();
        //public boolean isOpenDoor(); // open / close
        public GearState getStateOfTransmission(); // Neutral / Drive / Park / Reverse
        */

        // TODO : TEST SCENARIOS
        // 1. When car is driving, user tries to open door

        // 2. When oil has limitation, user tries to engine on

        // 3. When gas tank level is low, user tries to engine on

        // 4. When engine is already on, user tries to engine on again
    }
}
