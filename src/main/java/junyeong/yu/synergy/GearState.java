package junyeong.yu.synergy;

public interface GearState {

    public void pushAccelerator();
    public void pushBreaker();

    public void setTime(Time time);

    public String getGearState();
}
