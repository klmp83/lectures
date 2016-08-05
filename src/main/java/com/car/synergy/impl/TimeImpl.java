package com.car.synergy.impl;

import com.car.synergy.Time;

/**
 * this class TimeImpl defines/models the interface of Time.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public class TimeImpl implements Time {

    private long totalElapsedTime = 0; // millisecond
    private int currentSpeed = 0; // kilometer per hour
    private double totalMilege = 0; // kilometer

    /**
     * this method is calculating the distance
     * @param millisecond to set the time
     */
    @Override
    public void elapsed(long millisecond) {
        if (this.currentSpeed > 0) { // speed is per hour
            // if speed is 60 (per hour), and 30 minutes (1,800,000 ms) is passed, moving distance is 30 kilometers (a HOUR: 3,600,000 ms)
            // 60 * 1,800,000 / 3,600,000 => 30 (km)
            this.totalMilege += getEstimatedMileage(millisecond);
        }
        this.totalElapsedTime += millisecond;

        System.out.println("Time is elapsed for " + millisecond + "ms, total: " + this.totalElapsedTime + "ms, total milege: " + this.totalMilege + "km");
    }

    /**
     * this method is speeding up car
     * @param kilometerPerHour
     */
    @Override
    public void speedUp(int kilometerPerHour) {
        this.currentSpeed += kilometerPerHour;
    }

    /**
     * this method is speeding down car
     * @param kilometerPerHour
     */
    @Override
    public void speedDown(int kilometerPerHour) {
        this.currentSpeed -= kilometerPerHour;
        if (this.currentSpeed < 0) {
            this.currentSpeed = 0;
        }
    }

    /**
     * this method is getting current speed per hour
     * @return current speed of car
     */
    @Override
    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    /**
     * this method is getting total mileage of car
     * @return total mileage of car
     */
    @Override
    public double getTotalMileage() {
        return this.totalMilege;
    }

    /**
     * this method is getting estimated mileage for putting gasoline in gas tank
     * @param millisecond to set millisecond for time
     * @return estimate mileage of car for specific time
     */
    @Override
    public double getEstimatedMileage(long millisecond) {
        return this.currentSpeed * millisecond / HOUR;
    }
}
