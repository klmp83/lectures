package com.car.synergy.impl;

import com.car.synergy.Body;

/**
 * This class BodyImpl defines/models the interface of Body.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public class BodyImpl implements Body {

    private boolean openDoor = false; //door state

    /**
     * this method is opening the door
     */
    @Override
    public void openDoor() {
        if (isOpenDoor()) {
            System.out.println("Doors are already open");
            return;
        }
        this.openDoor = true;
        System.out.println("Doors are open now");
    }

    /**
     * this method is closing the door
     */
    @Override
    public void closeDoor() {
        if (isOpenDoor() == false) {
            System.out.println("Doors are already closed");
            return;
        }
        this.openDoor = false;
        System.out.println("Doors are closed now");
    }

    /**
     * this method is checking the door
     */
    @Override
    public boolean isOpenDoor() {
        return this.openDoor;
    }
}
