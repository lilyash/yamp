package thirdtask.Exception;

/**
 * Created by Student on 25.12.2017.
 */
public class InfinityException extends Throwable {
    public InfinityException() {
    }

    public InfinityException(String message) {
        super(message);
    }

    public InfinityException(String message, Throwable cause) {
        super(message, cause);
    }

    public InfinityException(Throwable cause) {
        super(cause);
    }
}
