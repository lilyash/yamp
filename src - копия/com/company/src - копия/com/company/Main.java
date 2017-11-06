package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d,e;
        d = a * b * c;
        e = (a + b + c) / 3;
        System.out.println(d);
        System.out.println(e);
        if ((a < b) && (a < c))
        {System.out.println(a);
            if (b < c) {
                System.out.println(b);
                System.out.println(c);
            }
            else
            {
                System.out.println(c);
                System.out.println(b);
            }
        }
        else  {
            if (b < c) {
                System.out.println(b);
                if (c < a)
                {
                    System.out.println(c);
                    System.out.println(a);
                }
                else
                {
                    System.out.println(a);
                    System.out.println(c);
                }
            }
            else
            { System.out.println(c);
                if (b < a)
                {
                    System.out.println(b);
                    System.out.println(a);
                }
                else
                {
                    System.out.println(a);
                    System.out.println(b);
                }
            }
        }
    }
}