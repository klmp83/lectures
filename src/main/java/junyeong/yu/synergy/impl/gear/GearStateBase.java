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
}
