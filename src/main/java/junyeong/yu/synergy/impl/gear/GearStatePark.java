package junyeong.yu.synergy.impl.gear;

import junyeong.yu.synergy.GearState;

/**
 * Created by yujun-yeong on 16-07-28.
 */
public class GearStatePark extends GearStateBase {
    @Override
    public void pushAccelerator() {
        System.out.println("Accelerator does not work when gear is park");
    }
}
