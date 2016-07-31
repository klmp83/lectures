package junyeong.yu.synergy.impl;

import junyeong.yu.synergy.Body;

/**
 * Created by yujun-yeong on 16-07-31.
 */
public class BodyImpl implements Body {

    private boolean openDoor = false;

    @Override
    public void openDoor() {
        if (isOpenDoor()) {
            System.out.println("Doors are already open");
            return;
        }
        this.openDoor = true;
        System.out.println("Doors are open now");
    }

    @Override
    public void closeDoor() {
        if (isOpenDoor() == false) {
            System.out.println("Doors are already closed");
            return;
        }
        this.openDoor = false;
        System.out.println("Doors are closed now");
    }

    @Override
    public boolean isOpenDoor() {
        return this.openDoor;
    }
}
