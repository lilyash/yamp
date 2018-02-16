package thirdtask.Exception;


public class ErrorDiscriminantSigment extends Exception {
    public ErrorDiscriminantSigment() {
    }

    public ErrorDiscriminantSigment(String message) {
        super(message);
    }

    public ErrorDiscriminantSigment(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorDiscriminantSigment(Throwable cause) {
        super(cause);
    }
}
