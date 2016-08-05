package com.car.synergy.exception;

/**
 * This class CarException defines/models the exception of GasTank.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public class GasTankException extends CarException {
    /**
     * Constructor to create objects of GasTank Exception
     * @param message to set exception message
     */
    public GasTankException(String message) {
        super(message);
    }
}
