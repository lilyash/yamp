package thirdtask;

import thirdtask.Exception.ErrorSigmentFunction;

public interface FunctionalFromOneArgument <P extends FunctionOnTheOneArgument> {
    double getResultFunction(P function)throws ErrorSigmentFunction;
}
