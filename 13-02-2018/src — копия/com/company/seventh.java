package com.company;
import java.util.Scanner;
public class seventh {
    public static void main(String[] args) {
        double series = 0, term = 1;
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите точку, в которой хотите вычислить функцию");
        double point = in.nextDouble();
        System.out.println("Введите нужную точность.");
        double accuracy = in.nextDouble();
        if (accuracy <= 0) {
            System.out.println("Точность должна быть больше нуля!");
        } else {
            series += term;
            do {
                count++;
                term *= point;
                term /= count;
                series += term;
            } while (Math.abs(term) > accuracy);
            System.out.println("Значение exp(x)в точке: " + point + " равно " + series);
        }
    }
}
