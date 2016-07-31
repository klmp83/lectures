package junyeong.yu.synergy.impl;

import junyeong.yu.synergy.Body;

/**
 * Created by yujun-yeong on 16-07-31.
 */
public class BodyImpl implements Body {

    private boolean openDoor = true;

    @Override
    public void openDoor() {
        if (isOpenDoor()) {
            System.out.println("Door is already opened");
            return;
        }
        this.openDoor = true;
    }

    @Override
    public void closeDoor() {
        if (isOpenDoor() == false) {
            System.out.println("Door is already closed");
            return;
        }
        this.openDoor = false;
    }

    @Override
    public boolean isOpenDoor() {
        return this.openDoor;
    }
}
