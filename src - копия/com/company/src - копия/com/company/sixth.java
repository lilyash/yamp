package com.company;

import java.util.Scanner;
public class sixth {
    public static void main(String[] args) {
        SLE(0,0,0,0,0,0);
        System.out.println();
        SLE(0,0,0,0,0,1);
        SLE(0,0,1,0,0,0);
        SLE(0,0,1,0,0,1);
        SLE(1,0,16,1,0,4);
        SLE(0,1,10,0,1,5);
        SLE(1,1,2,2,2,3);
        System.out.println();
        SLE(0,0,0,1,2,3);
        SLE(1,1,1,2,2,2);
        SLE(1,0,0,0,0,0);
        SLE(0,0,0,0,1,1);
        SLE(1,2,0,0,0,0);
        System.out.println();
        SLE(1,2,3,4,5,6);
    }
    public static void SLE(double a1, double b1, double c1, double a2, double b2, double c2) {

      /*  System.out.println("Введите коэффициенты первого уравнения и свободный член:");
        Scanner in = new Scanner(System.in);
        float a1 = in.nextFloat();
        float b1 = in.nextFloat();
        float c1 = in.nextFloat();
        System.out.println("Введите коэффициенты второго уравнения и свободный член:");
        float a2 = in.nextFloat();
        float b2 = in.nextFloat();
        float c2 = in.nextFloat();*/
        if ((a2 == 0) && (b2 == 0) && (a1 == 0) && (b1 == 0)) {
            System.out.println(a1 + "x + " + b1 + "y=" + c1);
            System.out.println(a2 + "x + " + b2 + "y=" + c2);
        } else {
            if ((a1 != 0) && (b1 != 0) && (a2 == 0) && (b2 == 0)) {
                System.out.println("x = (" + c1 + " - " + b1 + "y)/" + a1);
            } else {
                if ((a1 != 0) && (b1 == 0) && (a2 == 0) && (b2 == 0)) {
                    System.out.println("x = " + c1 / a1);
                } else {
                    if ((a1 == 0) && (b1 != 0) && (a2 == 0) && (b2 == 0)) {
                        System.out.println("y = " + c1 / b1);
                    } else {
                        if ((a2 != 0) && (b2 != 0) && (a1 == 0) && (b1 == 0)) {
                            System.out.println("x = (" + c2 + " - " + b2 + "y)/" + a2);
                        } else {
                            if ((a2 != 0) && (b2 == 0) && (a1 == 0) && (b1 == 0)) {
                                System.out.println("x = " + c2 / a2);
                            } else {
                                if ((a2 == 0) && (b2 != 0) && (a1 == 0) && (b1 == 0)) {
                                    System.out.println("y = " + c2 / b2);
                                } else {
                                    if ((a1 / a2 == b1 / b2) && (b1 / b2 == c1 / c2)) {
                                        System.out.println("система имеет множество решений");
                                    } else {
                                        if ((a1 / a2 == b1 / b2) && (a1 / a2 != c1 / c2)) {
                                            System.out.println("Система не имеет решений");
                                        } else {
                                            if ((a1 == 0) && (b1 != 0) && (a2 != 0) && (b2 == 0)) {
                                                System.out.println("x = " + c1 / b1);
                                                System.out.println("y = " + c2 / a2);
                                            } else {
                                                System.out.println(a1 + "x + " + b1 + "y = " + c1);
                                                System.out.println(a2 + "x + " + b2 + "y = " + c2);
                                                double y = (c2 + (-c1 * a2) / a1) / ((-b1 * a2) / a1 + b2);
                                                double x = (-b1 * y + c1) / a1;
                                                System.out.println("x = " + x);
                                                System.out.println("y = " + y);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}