package imit.student;

/**
 * Created by Student on 04.09.2017.
 */
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        double argum;
        Scanner in=new Scanner(System.in);
        System.out.println("Введите верхний и нижний пределы табулирования и шаг табулирования ");
        double grantop=in.nextDouble();
        double granbot=in.nextDouble();
        double shag=in.nextDouble();
        System.out.println("-----------------------------");
        System.out.println("|  x  |        sin(x)       |");
        System.out.println("-----------------------------");
        argum=granbot;
        while(argum <= grantop) {
            System.out.println("| " + argum + " | " + Math.sin(argum) + " |");
            System.out.println("-----------------------------");
            argum+=shag;
        }
    }
}
