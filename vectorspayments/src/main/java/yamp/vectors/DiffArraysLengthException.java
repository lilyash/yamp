package yamp.vectors;

/**
 * Created by
 * Student on 06.11.2017.
 */
public class DiffArraysLengthException extends Exception{
    public DiffArraysLengthException() {
        super("Different length of arrays!");
    }

    public DiffArraysLengthException(String message) {
        super(message);
    }

    public DiffArraysLengthException(String message, Throwable cause) {
        super(message, cause);
    }
}
