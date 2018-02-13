package com.company.task2;

/**
 * Created by Student on 18.12.2017.
 */
public class BadStringCountException extends Exception {
    public BadStringCountException() {
    }

    public BadStringCountException(String message) {
        super(message);
    }

    public BadStringCountException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadStringCountException(Throwable cause) {
        super(cause);
    }
}
