package junyeong.yu.synergy;

public interface GearState {
	// TODO : decide gear state action
    public void pushAccelerator();
    public void pushBreaker();

    public void setTime(Time time);
}
