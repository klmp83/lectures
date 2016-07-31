package junyeong.yu.synergy.impl.gear;

import junyeong.yu.synergy.GearState;
import junyeong.yu.synergy.Time;

/**
 * Created by yujun-yeong on 16-07-28.
 */
public class GearStateDrive extends GearStateBase {
    @Override
    public void pushAccelerator() {
        System.out.println("Car is moving forward");
        time.speedUp(Time.ACCELERATOR_SPEED_UNIT);
    }
}
