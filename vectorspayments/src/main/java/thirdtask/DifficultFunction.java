package thirdtask;

import thirdtask.Exception.ErrorSigmentFunction;

public class DifficultFunction implements FunctionOnTheOneArgument {
    private LinearFunction numerator;
    private LinearFunction denominator;

    public DifficultFunction(
            LinearFunction numerator,
            LinearFunction denominator,
            double borderLeft,
            double borderRight
    ) throws ArithmeticException {

        if(denominator.getA()==0 && denominator.getB()==0){
            throw new ArithmeticException("Деление на ноль");
        }
        this.numerator = new LinearFunction(numerator, borderLeft, borderRight);
        this.denominator = new LinearFunction(denominator, borderLeft, borderRight);
    }

    public LinearFunction getDenominator() {
        return denominator;
    }

    public LinearFunction getNumerator() {
        return numerator;
    }

    public double valueOf(double arg) throws ErrorSigmentFunction {
        if(denominator.valueOf(arg)==0){
            throw new ArithmeticException();
        }
        return (numerator.valueOf(arg)/denominator.valueOf(arg));
    }

    public double getBorderLeft() {
        return numerator.getBorderLeft();
    }

    public double getBorderRight() {
        return numerator.getBorderRight();
    }
}
