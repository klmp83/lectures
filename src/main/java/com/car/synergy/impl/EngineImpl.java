package com.car.synergy.impl;

import com.car.synergy.Engine;

/**
 * This class EngineImpl defines/models the interface of Engine.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public class EngineImpl implements Engine {

    private String currentEngineState = ENGINE_STATE_STOP; //current engine state
    private boolean oilState = false; //current oil state

    /**
     * This method is turning on engine
     */
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

    /**
     * This method is turning off engine
     */
    @Override
    public void turnOff() {
        System.out.println("Engine is turning off now");
        this.currentEngineState = ENGINE_STATE_STOP;
    }

    /**
     * This method is putting oil
     */
    @Override
    public void insertOil() {
        this.oilState = true;
    }

    /**
     * This method is checking oil state
     * @return oil state
     */
    @Override
    public String getOilLevel() {
        return this.oilState ? "ok" : "not ok";
    }

    /**
     * This method is checking engine state
     * @return current engine state
     */
    @Override
    public String getEngineState() {
        return this.currentEngineState;
    }
}
