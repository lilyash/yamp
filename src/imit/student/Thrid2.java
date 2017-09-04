package imit.student;

/**
 * Created by Student on 04.09.2017.
 */

        import java.util.Scanner;
public class Thrid2 {
    public static void main(String[] args) {
        int proizv, bufswap;
        double sredarifm;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int inputfirst = in.nextInt();
        int inputsecond = in.nextInt();
        int inputthird = in.nextInt();
        sredarifm=inputfirst+inputsecond+inputthird;
        sredarifm=sredarifm/3.0;
        proizv=inputfirst*inputsecond*inputthird;
        System.out.println("Srednee arifm: " + sredarifm);
        System.out.println("Proizvedenie: " + proizv);
        if(inputfirst < inputsecond) {
            bufswap=inputfirst;
            inputfirst=inputsecond;
            inputsecond=bufswap;
            if (inputsecond < inputthird)
            {
                bufswap=inputthird;
                inputthird=inputsecond;
                inputsecond=bufswap;
                if(inputfirst < inputsecond) {
                    bufswap = inputfirst;
                    inputfirst = inputsecond;
                    inputsecond = bufswap;
                }
            }
        }
        else{
            if(inputfirst < inputthird) {
                bufswap=inputfirst;
                inputfirst=inputthird;
                inputthird=bufswap;
            }
            if (inputsecond < inputthird) {
                bufswap=inputsecond;
                inputsecond=inputthird;
                inputthird=bufswap;
            }
        }
        System.out.println(inputthird + " " + inputsecond + " " + inputfirst);
    }

}

