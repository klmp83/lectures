package junyeong.yu.synergy.impl;

import junyeong.yu.synergy.Time;

/**
 * Created by yujun-yeong on 16-07-28.
 */
public class TimeImpl implements Time {

    private int elapsedTime = 0;
    private int currentSpeed = 0; // TODO : Should think

    @Override
    public void elapsed(int millisecond) {
        this.elapsedTime += millisecond;
    }
}
