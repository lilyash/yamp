package com.company.task2;

/**
 * Created by Student on 18.12.2017.
 */
public class BadDateException extends Exception {
    public BadDateException() {
    }

    public BadDateException(String message) {
        super(message);
    }

    public BadDateException(String message, Throwable cause) {
        super(message, cause);
    }
}
