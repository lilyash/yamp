package imit.student;

/**
 * Created by Student on 04.09.2017.
 */
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        int sredarifm, proizv, bufswap;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int inputfirst = in.nextInt();
        int inputsecond = in.nextInt();
        int inputthird = in.nextInt();
        sredarifm=inputfirst+inputsecond+inputthird;
        sredarifm=sredarifm/3;
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
                inputsecond=inputthird;
                inputthird=inputsecond;
            }
        }
        else{
            if(inputfirst < inputthird) {
                bufswap=inputfirst;
                inputfirst=inputthird;
                inputthird=bufswap;
            }
        }

    }

}

