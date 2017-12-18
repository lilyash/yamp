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
    public static void SLE(double firstx, double firsty, double firstequal, double secondx, double secondy,
                           double secondequal) {
        double x, y;
      /* Scanner in = new Scanner(System.in);
        System.out.println("Введите коэффициенты для первого уравнения");
        double firstx = in.nextDouble();
        double firsty = in.nextDouble();
        double firstequal = in.nextDouble();
        System.out.println("Введите коэффициенты для второго уравнения");
        double secondx = in.nextDouble();
        double secondy = in.nextDouble();
        double secondequal = in.nextDouble();;*/
        if((firstx==0 && firsty==0 && firstequal==0) || (secondx==0 && secondy==0 && secondequal==0)){
            if(firstx!=0 && firsty!=0){
                System.out.println("Решений бесконечно много!");
                return;
            }
            if(secondx!=0 && secondy!=0){
                System.out.println("Решений бесконечно много!");
                return;
            }
        }
        if(firstx==0 && secondx==0 && firsty==0 && secondy==0 && firstequal==0 && secondequal==0){
            System.out.println("Решений бесконечно много!");
            return;
        }
        if((firstx==0 && firsty==0 && firstequal!=0) || (secondx==0 && secondy==0 && secondequal!=0)) {
            System.out.println("Решений нет!");
        }
        else {
            while (firstx != 0 && secondx != 0) {
                if (Math.abs(firstx) >= Math.abs(secondx)) {
                    if ((secondx >= 0) && (firstx > 0)) {
                        firstx -= secondx;
                        firsty -= secondy;
                        firstequal -= secondequal;
                    } else {
                        firstx += secondx;
                        firsty += secondy;
                        firstequal += secondequal;
                    }
                } else {
                    if ((firstx >= 0) && (secondx >= 0)) {
                        secondx -= firstx;
                        secondy -= firsty;
                        secondequal -= firstequal;
                    } else {
                        secondx += firstx;
                        secondy += firsty;
                        secondequal += firstequal;
                    }
                }
            }
            if ((firstx == 0 && firsty == 0 && firstequal != 0) || (secondx == 0 && secondy == 0 && secondequal != 0)) {
                System.out.println("Решений нет!");
            }
            else {
                if (firstx == 0) {
                    if(firsty == 0) {
                        if(firstequal!=0){
                            System.out.println("Решений нет!");
                        }
                        else{
                            if(secondx==0) {
                                System.out.println("X - любое");
                                y = secondequal / secondy;
                                System.out.println("Y := " + y);
                            } else {
                                if(secondy==0) {
                                    x = secondequal / secondx;
                                    System.out.println("X := " + x);
                                    System.out.println("Y - любое");
                                }
                                else{
                                    System.out.println("Решений бесконечно много!");
                                }
                            }

                        }
                    }
                    else {
                        y = firstequal / firsty;
                        x = (secondequal - secondy * y) / secondx;
                        if((y*secondy+x*secondx)!=secondequal){
                            System.out.println("Решений нет!");
                        }else {
                            if (firstx == 0 && secondx == 0) {
                                System.out.println("X - любое");
                            } else {
                                x = (secondequal - secondy * y) / secondx;
                                System.out.println("X := " + x);
                            }
                            if(-y==0){
                                y=0;
                            }
                            System.out.println("Y := " + y);
                        }
                    }
                }
                else {
                    if(secondy == 0) {
                        if(secondequal!=0){
                            System.out.println("Решений нет!");
                        }
                        else{
                            x=firstequal/firstx;
                            System.out.println("X := "+x);
                            System.out.println("Y - любое");
                        }
                    }
                    else {
                        y = secondequal / secondy;
                        x = (firstequal - firsty * y) / firstx;
                        System.out.println("X := " + x);
                        System.out.println("Y := " + y);
                    }
                }

            }
        }
    }
}