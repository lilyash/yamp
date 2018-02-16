package thirdtask;

import thirdtask.Exception.ErrorSigmentFunction;

public class LinearFunction implements FunctionOnTheOneArgument{
    private double A;
    private double B;
    private double borderLeft;
    private double borderRight;
    public LinearFunction(double A, double B, double borderLeft, double borderRight) {
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
    public LinearFunction(LinearFunction copy){
        this.A = copy.A;
        this.B = copy.B;
        this.borderLeft = copy.borderLeft;
        this.borderRight = copy.borderRight;
    }
    public LinearFunction(LinearFunction copy, double borderLeft, double borderRight){
        this.A = copy.A;
        this.B = copy.B;
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
        return (A*arg+B);
    }

    public double getBorderLeft() {
        return borderLeft;
    }

    public double getBorderRight() {
        return borderRight;
    }
    public double getA(){
        return A;
    }
    public double getB(){
        return B;
    }
}
