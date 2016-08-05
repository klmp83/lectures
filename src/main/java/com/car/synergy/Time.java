package com.car.synergy;

/**
 * This interface Time defines/models Time action for Car.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public interface Time {

    public final static int SECOND = 1000; // a second of the time
    public final static int MINUTE = SECOND * 60; // a minute of the time
    public final static int HOUR = MINUTE * 60; // a hour of the time
    public final static int DAY = HOUR * 24; // a day of the time
    public final static int WEEK = DAY * 7; // a week of the time
    public final static int YEAR = DAY * 365; // a year of the time

    public final static int ACCELERATOR_SPEED_UNIT = 20; // increase speed 20 kilometer per hour using accelerator for 1000 ms
    public final static int BREAKER_SPEED_UNIT = 20; // decrease speed 20 kilometer per hour using breaker for 1000 ms

    /**
     * this method is calculating the distance
     * @param millisecond to set the time
     */
    public void elapsed(long millisecond);

    /**
     * this method is speeding up car
     * @param kilometerPerHour
     */
    public void speedUp(int kilometerPerHour);

    /**
     * this method is speeding down car
     * @param kilometerPerHour
     */
    public void speedDown(int kilometerPerHour);

    /**
     * this method is getting current speed per hour
     * @return current speed of car
     */
    public int getCurrentSpeed();
    /**
     * this method is getting total mileage of car
     * @return total mileage of car
     */
    public double getTotalMileage();
    /**
     * this method is getting estimated mileage for putting gasoline in gas tank
     * @param millisecond to set millisecond for time
     * @return estimate mileage of car for specific time
     */
    public double getEstimatedMileage(long millisecond);
}