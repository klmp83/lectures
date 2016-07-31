package junyeong.yu.synergy.impl;

import junyeong.yu.synergy.Time;

/**
 * Created by yujun-yeong on 16-07-28.
 */
public class TimeImpl implements Time {

    private long elapsedTime = 0; // millisecond
    private int currentSpeed = 0; // kilometer per hour
    private double currentMilege = 0; // kilometer

    @Override
    public void elapsed(long millisecond) {
        if (this.currentSpeed > 0) { // speed is per hour
            // if speed is 60 (per hour), and 30 minutes (1,800,000 ms) is passed, moving distance is 30 kilometers (a HOUR: 3,600,000 ms)
            // 60 * 1,800,000 / 3,600,000 => 30 (km)
            this.currentMilege += this.currentSpeed * millisecond / HOUR;
        }
        this.elapsedTime += millisecond;
    }

    @Override
    public void speedUp(int kilometerPerHour) {
        this.currentSpeed += kilometerPerHour;
    }

    @Override
    public void speedDown(int kilometerPerHour) {
        this.currentSpeed -= kilometerPerHour;
        if (this.currentSpeed < 0) {
            this.currentSpeed = 0;
        }
    }

    @Override
    public int getCurrentSpeed() {
        return this.currentSpeed;
    }
    @Override
    public double getCurrentMileage() {
        return this.currentMilege;
    }
}
