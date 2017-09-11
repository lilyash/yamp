package imit.student;

/**
 * Created by Student on 04.09.2017.
 */
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        double sredarifm, proizv, bufswap;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа: ");
        double inputfirst = in.nextDouble();
        double inputsecond = in.nextDouble();
        double inputthird = in.nextDouble();
        sredarifm=inputfirst+inputsecond+inputthird;
        sredarifm=sredarifm/3;
        proizv=inputfirst*inputsecond*inputthird;
        System.out.println("Среднее арифметическое: " + sredarifm);
        System.out.println("Произведение: " + proizv);
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

