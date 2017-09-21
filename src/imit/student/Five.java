package imit.student;

/**
 * Created by Student on 04.09.2017.
 */
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        double argum;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите верхний и нижний пределы табулирования и шаг табулирования ");
        double grantop = in.nextDouble();
        double granbot = in.nextDouble();
        double shag = in.nextDouble();
        if (granbot > grantop && shag > 0) {
            System.out.println("Нижняя граница больше верхней и шаг положительный!");
            return;
        }
        if (shag == 0) {
            System.out.println("Шаг нулевой!");
            return;
        }
        if (shag < 0 && granbot < grantop) {
            System.out.println("Нижняя граница меньше верхней и шаг отрицательный!");
            return;
        }

        System.out.println("-----------------------------");
        System.out.println("|  x  |        sin(x)       |");
        System.out.println("-----------------------------");

        if(shag>0) {
            argum = granbot;
            do {
                System.out.println("| " + argum + " | " + Math.sin(argum) + "  |");
                System.out.println("-----------------------------");
                argum += shag;
            } while (argum <= grantop);
        }
        if(shag<0) {
            argum = granbot;
            do {
                System.out.println("| " + argum + " | " + Math.sin(argum) + "  |");
                System.out.println("-----------------------------");
                argum += shag;
            } while (argum >= grantop);
        }
    }
}
