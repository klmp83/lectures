package junyeong.yu.synergy.impl;

import junyeong.yu.synergy.Engine;

public class EngineImpl implements Engine {

    private String currentEngineState = ENGINE_STATE_STOP;

    @Override
    public void turnOn() {
        if (Engine.ENGINE_STATE_RUNNING.equals(getEngineState())) {
            System.out.println("Engined is already running");
            return;
        }

        System.out.println("Engine is running now");
        this.currentEngineState = ENGINE_STATE_RUNNING;


    }

    @Override
    public void turnOff() {
        // TODO : need to implement
    }

    @Override
    public String getOilLevel() {
        // TODO : need to implement
        return null;
    }

    @Override
    public String getEngineState() {
        return this.currentEngineState;
    }
}
