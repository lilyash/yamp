package thirdtask.Exception;

/**
 * Created by Student on 25.12.2017.
 */
public class ErrorDataInput extends Throwable {
    public ErrorDataInput() {
    }

    public ErrorDataInput(String message) {
        super(message);
    }

    public ErrorDataInput(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorDataInput(Throwable cause) {
        super(cause);
    }
}
