package junyeong.yu.synergy.impl;

import junyeong.yu.synergy.GearState;
import junyeong.yu.synergy.Time;
import junyeong.yu.synergy.Transmission;
import junyeong.yu.synergy.impl.gear.GearStateDrive;
import junyeong.yu.synergy.impl.gear.GearStateNeutral;
import junyeong.yu.synergy.impl.gear.GearStatePark;
import junyeong.yu.synergy.impl.gear.GearStateReverse;

/**
 * Created by yujun-yeong on 16-07-28.
 */
    public class TransmissionImpl implements Transmission {

    private GearState gearStatePark = new GearStatePark();
    private GearState gearStateNeutral = new GearStateNeutral();
    private GearState gearStateDrive = new GearStateDrive();
    private GearState gearStateReverse = new GearStateReverse();
    private GearState currentGearState = gearStatePark;

    @Override
    public void setTime(Time time) {
        this.gearStatePark.setTime(time);
        this.gearStateNeutral.setTime(time);
        this.gearStateDrive.setTime(time);
        this.gearStateReverse.setTime(time);
    }

    @Override
    public String getGearState() {
        return this.currentGearState.getGearState();
    }

    @Override
    public void pushAccelerator() {
        currentGearState.pushAccelerator();
    }
    @Override
    public void pushBreaker() {
        currentGearState.pushBreaker();
    }

    // getters
    @Override
    public GearState getGearStateNeutral() {
        return gearStateNeutral;
    }

    @Override
    public GearState getGearStateDrive() {
        return gearStateDrive;
    }

    @Override
    public GearState getGearStatePark() {
        return gearStatePark;
    }

    @Override
    public GearState getGearStateReverse() {
        return gearStateReverse;
    }

    @Override
    public GearState getStateOfTransmission() {
        return this.currentGearState;
    }

    @Override
    public void shiftGear(GearState gearState) {
        this.currentGearState = gearState;
    }
}
