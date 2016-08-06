package com.car.synergy.time;

import com.car.synergy.Car;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by yujun-yeong on 16-08-06.
 */
public class CarTimeTrigger {
    private Timer timer;
    private Car car;
    public void setCar(Car car) {
        this.car = car;
    }

    public void startTrigger() {
        final int TIME_INTERVAL = 1000;

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                car.elapsed(TIME_INTERVAL * 100);
            }
        }, 0, TIME_INTERVAL * 2);
    }

    public void stopTrigger() {
        timer.cancel();
    }
}
