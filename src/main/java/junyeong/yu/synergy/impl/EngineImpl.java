package junyeong.yu.synergy.impl;

import junyeong.yu.synergy.Engine;

public class EngineImpl implements Engine {

    private String currentEngineState = ENGINE_STATE_STOP;
    private boolean oilState = false;

    @Override
    public void turnOn() {
        if (Engine.ENGINE_STATE_RUNNING.equals(getEngineState())) {
            System.out.println("Engined is already running");
            return;
        }

        if (this.oilState) {
            System.out.println("Engine is running now");
            this.currentEngineState = ENGINE_STATE_RUNNING;
            return;
        }

        System.out.println("Engine oil is required");

    }

    @Override
    public void turnOff() {
        System.out.println("Engine is turning off now");
        this.currentEngineState = ENGINE_STATE_STOP;
    }

    @Override
    public void insertOil() {
        this.oilState = true;
    }

    @Override
    public String getOilLevel() {
        return this.oilState ? "ok" : "not ok";
    }

    @Override
    public String getEngineState() {
        return this.currentEngineState;
    }
}
