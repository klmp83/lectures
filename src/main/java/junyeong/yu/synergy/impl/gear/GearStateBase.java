package junyeong.yu.synergy.impl.gear;

import junyeong.yu.synergy.GearState;
import junyeong.yu.synergy.Time;

/**
 * Created by yujun-yeong on 16-07-31.
 */
abstract public class GearStateBase implements GearState {
    protected Time time;
    @Override
    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public void pushBreaker() {
        time.speedDown(Time.BREAKER_SPEED_UNIT);
        System.out.println("Car speed is decreased. Current speed is " + time.getCurrentSpeed() + " km/hour");
    }
}
