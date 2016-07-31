package junyeong.yu.synergy.impl.gear;

import junyeong.yu.synergy.GearState;
import junyeong.yu.synergy.Time;

/**
 * Created by yujun-yeong on 16-07-28.
 */
public class GearStatePark extends GearStateBase {
    @Override
    public void pushAccelerator() {
        System.out.println("Accelerator does not work when gear is park");
    }

    @Override
    public void pushBreaker() {
        System.out.println("Car is already parked. However, to shift gear, breaker is used");
    }
}
