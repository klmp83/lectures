package com.car.synergy;

/**
 * This interface Body defines/models Body of Car.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public interface Body {
    /**
     * this method is opening the door
     */
	public void openDoor();
    /**
     * this method is closing the door
     */
    public void closeDoor();

    /**
     * this method is checking the door
     */
	public boolean isOpenDoor(); // open / close
}
