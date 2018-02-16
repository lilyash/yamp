package thirdtask;

import thirdtask.Exception.ErrorSigmentFunction;

public class ExpFunction implements FunctionOnTheOneArgument{
    private double A;
    private double B;
    private double borderLeft;
    private double borderRight;
    public ExpFunction(double A, double B, double borderLeft, double borderRight) {
        this.A = A;
        this.B = B;
        if (borderLeft > borderRight) {
            double temp = 0;
            temp = borderLeft;
            borderLeft = borderRight;
            borderRight = temp;
        }
        this.borderLeft = borderLeft;
        this.borderRight = borderRight;
    }
    public double valueOf(double arg) throws ErrorSigmentFunction {
        if(arg>borderRight || arg<borderLeft){
            throw new ErrorSigmentFunction("Error!");
        }
        return (A*Math.exp(arg)+B);
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getBorderLeft() {
        return borderLeft;
    }

    public double getBorderRight() {
        return borderRight;
    }
}
