package thirdtask;

import thirdtask.Exception.ErrorDataInput;
import thirdtask.Exception.ErrorDiscriminantSigment;
import thirdtask.Exception.InfinityException;

public class Polinom {
    private double a, b, c;
    private double [] arrayRoots = new double[2];

    public Polinom(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){return a;}
    public double getB(){return b;}
    public double getC(){return c;}
    public double[] searchRoots() throws ErrorDiscriminantSigment, InfinityException, ErrorDataInput {
        if(a!=0){
            double discriminant = b * b - 4 * a * c;
            if(discriminant>=0){
                arrayRoots[0] = ((-b + Math.sqrt(discriminant)) / 2 * a);
                arrayRoots[1] = ((-b - Math.sqrt(discriminant)) / 2 * a);
            }
            if(discriminant<0){
                throw new ErrorDiscriminantSigment();
            }
        }
        if((a==0)){
            if((c==0) && (b!=0)){
                arrayRoots[0] = 0;
                arrayRoots[1] = 0;
            }
            if(b==0){
                if(c==0){
                    throw new InfinityException();
                }
                if(c!=0){
                    throw new ErrorDataInput();
                }
            }
            if(b!=0 && c!=0){
                arrayRoots[0] = -c/b;
                arrayRoots[1] = -c/b;
            }
        }
        return arrayRoots;
    }

}
