package finreport;

/**
 * Created by Student on 18.12.2017.
 */
public class WrongQuantity extends Exception {
    public WrongQuantity() {
    }

    public WrongQuantity(String message) {
        super(message);
    }

    public WrongQuantity(String message, Throwable cause) {
        super(message, cause);
    }
}
