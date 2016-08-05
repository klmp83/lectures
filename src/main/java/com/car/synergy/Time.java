package com.car.synergy;

public interface Time {

    public final static int SECOND = 1000;
    public final static int MINUTE = SECOND * 60;
    public final static int HOUR = MINUTE * 60;
    public final static int DAY = HOUR * 24;
    public final static int WEEK = DAY * 7;
    public final static int YEAR = DAY * 365;

    public final static int ACCELERATOR_SPEED_UNIT = 20; // Increase speed 20 kilometer per hour using accelerator for 1000 ms
    public final static int BREAKER_SPEED_UNIT = 20; // Decreate speed 20 kilomether per hour using breaker for 1000 ms

    public void elapsed(long millisecond);
    public void speedUp(int kilometerPerHour);
    public void speedDown(int kilometerPerHour);

    public int getCurrentSpeed();
    public double getTotalMileage();
    public double getEstimatedMileage(long millisecond);
}