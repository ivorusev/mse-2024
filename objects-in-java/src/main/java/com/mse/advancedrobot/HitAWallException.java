package com.mse.advancedrobot;

/**
 * Exception thrown when robot tries to move through a wall.
 */
public class HitAWallException extends RuntimeException {

    public HitAWallException() {
    }

    public HitAWallException(String message) {
        super(message);
    }

    public HitAWallException(String message, Throwable cause) {
        super(message, cause);
    }

    public HitAWallException(Throwable cause) {
        super(cause);
    }

    public HitAWallException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
