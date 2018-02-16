package thirdtask.Exception;

public class ErrorSigmentFunction extends Exception {
    public ErrorSigmentFunction() {
        super();
    }

    public ErrorSigmentFunction(String s) {
        super(s);
    }

    public ErrorSigmentFunction(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ErrorSigmentFunction(Throwable throwable) {
        super(throwable);
    }
}
