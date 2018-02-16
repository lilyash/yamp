package thirdtask;

import thirdtask.Exception.ErrorSigmentFunction;

/**
 * Created by Student on 25.12.2017.
 */
public class Integral implements FunctionalFromOneArgument {
    private double a;
    private double b;
    private double accuracy;//точность

    public Integral(double a, double b, double accuracy) {
        this.a = a;
        this.b = b;
        this.accuracy = accuracy;
    }

    public double getResultFunction(FunctionOnTheOneArgument function) throws ErrorSigmentFunction {
        if (this.a < function.getBorderLeft() || this.b > function.getBorderRight()) {
            throw new ErrorSigmentFunction();
        }
        double step = b - a;
        double oneResult=0, twoResult;
        double x = a;
        double nowAccuracy = Double.MAX_VALUE;
        double lastAccuracy = nowAccuracy;
        int n = 1;
        twoResult = step * function.valueOf(x);
        while (nowAccuracy > lastAccuracy || nowAccuracy >= this.accuracy) {
            n *= 2;
            lastAccuracy = nowAccuracy;
            x = this.a;
            oneResult = 0.0;
            step /= 2.0;
            for (int i = 0; i < n; i++) {
                oneResult += function.valueOf(x);
                x += step;
            }
            oneResult *= step;
            nowAccuracy = Math.abs(oneResult - twoResult) / 3.0;
            twoResult = oneResult;

        }
        return oneResult;

    }
}
