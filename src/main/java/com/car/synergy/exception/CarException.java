package com.car.synergy.exception;

/**
 * This class CarException defines/models the exception of Car.
 *
 * @author Junghwan Yang, Junyeong Yu
 * @version August 5, 2016
 */
public class CarException extends RuntimeException {
    /**
     * Constructor to create objects of Car Exception
     * @param message to set exception message
     */
    public CarException(String message) {
        super(message);
    }
}
