package thirdtask;

import thirdtask.Exception.ErrorSigmentFunction;

/**
 * Created by Student on 25.12.2017.
 */
public class AddSegment implements FunctionalFromOneArgument{
    private double a, b;
    public AddSegment(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double getResultFunction(FunctionOnTheOneArgument function) throws ErrorSigmentFunction {
        return function.valueOf(a) + function.valueOf(b) + function.valueOf((b-a)/2.0);
    }
}
