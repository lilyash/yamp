package imit.student;

/**
 * Created by Student on 04.09.2017.
 */
import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        double discriminant, quan=0;
        double[] answer = new double[2];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        double firstindex=in.nextDouble();
        double secondindex=in.nextDouble();
        double thirdindex=in.nextDouble();
        discriminant=secondindex * secondindex - 4 * firstindex * thirdindex;
        if(discriminant == 0) {
            answer[0]=(0 - secondindex)/(2*firstindex);
            quan=1;
        }
        if(discriminant < 0) {
            quan=0;
        }
        if (discriminant > 0) {
            quan=2;
            answer[0]=(0-secondindex + Math.sqrt(discriminant))/(2*firstindex);
            answer[1]=(0-secondindex - Math.sqrt(discriminant))/(2*firstindex);
        }
        System.out.println("Chislo kornei: " + quan);
        System.out.print("Korni: ");
        for(int i=0; i<quan; i++) {
            System.out.println(+ answer[i]);
        }
    }
}
