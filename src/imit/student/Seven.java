package imit.student;

import java.util.Scanner;

public class Seven {

    public static void main(String[] args) {
        double series=0, term=1;
        int count=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите точку, в которой хотите вычислить функцию");
        double point = in.nextDouble();
        System.out.println("Введите нужную точность.");
        double accuracy = in.nextDouble();
        do {
            series+=term;
            count++;
            term*=point;
            term/=count;
        } while(term > accuracy);
        System.out.println("Значение exp(x)в точке: " + point + " равно " +series);
    }
}