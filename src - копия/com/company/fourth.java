package com.company;

import java.util.Scanner;
public class fourth {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите коэффициенты уравнения");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d, x, x1, x2;
        if (a==0 && b==0 && c!=0)
        {
            System.out.println("Уравнение не имеет корней");
            return;
        }
        if(a==0)
        {
            if( a == 0 && b == 0 && c == 0)
            {
                System.out.println("Х - любое число, т.к 0*х^2 +/- 0*x = 0");
            }
            else {
                x = (-c)/ b;
                System.out.println("Корень =" + x);
            }
        }
        else {

            d = ((b * b) - (4 * a * c));
            if (d < 0) {
                System.out.println("Дискриминант меньше 0, уравнение не имеет корней");
                return;
            }

            if (d == 0) {
                x = ((2 * a) / b);
                System.out.println("Уравнение имеет один корень" + x);
            }
            if (d > 0) {
                x1 = (((-b) - Math.sqrt(d)) / 2 * a);
                x2 = (((-b) + Math.sqrt(d)) / 2 * a);
                System.out.println("Уравнение имеет два корня " + x1 + "\t" + x2);
            }
        }
    }
}
