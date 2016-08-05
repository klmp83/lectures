package junyeong.yu.synergy;

public interface Engine {

    public final static String ENGINE_STATE_RUNNING = "running";
    public final static String ENGINE_STATE_STOP = "stop";

	public void turnOn();
    public void turnOff();

    public void insertOil();
	
	// TODO : below return types should be changed to proper types
	public String getOilLevel(); // TODO : think about on/off indicator based on time(5 to 6 month)
	public String getEngineState(); // running / stop
}
