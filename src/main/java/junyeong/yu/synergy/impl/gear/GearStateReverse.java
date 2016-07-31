package junyeong.yu.synergy.impl.gear;

import junyeong.yu.synergy.GearState;
import junyeong.yu.synergy.Time;

/**
 * Created by yujun-yeong on 16-07-28.
 */
public class GearStateReverse extends GearStateBase {
    @Override
    public void pushAccelerator() {
        time.speedUp(Time.ACCELERATOR_SPEED_UNIT);
        System.out.println("Car is moving backward. Current speed is " + time.getCurrentSpeed() + "km/hour");
    }
}
