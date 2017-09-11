package imit.student;

import java.util.Scanner;

public class Six {

    public static void main(String[] args) {
        double x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите коэффициенты для первого уравнения");
        double firstx = in.nextDouble();
        double firsty = in.nextDouble();
        double firstequal = in.nextDouble();
        System.out.println("Введите коэффициенты для второго уравнения");
        double secondx = in.nextDouble();
        double secondy = in.nextDouble();
        double secondequal = in.nextDouble();
        while(firstx!=0 && secondx!=0) {
            if (Math.abs(firstx) >= Math.abs(secondx)) {
                if((secondx>=0) && (firstx>0)) {
                    firstx -= secondx;
                    firsty -= secondy;
                    firstequal -= secondequal;
                }
                else{
                    firstx += secondx;
                    firsty += secondy;
                    firstequal += secondequal;
                }
            }
            else{
                if((firstx>=0) && (secondx>=0)) {
                    secondx -= firstx;
                    secondy -= firsty;
                    secondequal -= firstequal;
                }
                else{
                    secondx += firstx;
                    secondy += firsty;
                    secondequal += firstequal;
                }
            }
        }
        if((firstx==0 && firsty==0 && firstequal!=0) || (secondx==0 && secondy==0 && secondequal!=0)){
            System.out.println("Решений нет!");
        }
        else {
            if (firstx == 0) {
                y = firstequal / firsty;
                x = (secondequal - secondy * y) / secondx;
            } else {
                y = secondequal / secondy;
                x = (firstequal - firsty * y) / firstx;
            }
            System.out.println("X := " + x);
            System.out.println("Y := " + y);
        }
    }
}
