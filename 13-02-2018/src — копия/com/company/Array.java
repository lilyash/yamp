package com.company;

import java.util.Scanner;
public class Array {

    private static int[] fill(int array[]){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
        {
            array[i] = scan.nextInt();
        }
        return array;
    }

    private static int sum(int array[]){
        int sum=0;
        for (int anArray : array) {
            sum += anArray;
        }
        return sum;
    }

    private static int even(int array[]){
        int counter=0;
        for (int anArray : array) {
            if (anArray % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int borders(int array[], double a, double b){
        int counter2=0;
        for (int anArray : array) {
            if (anArray >= a && anArray <= b) {
                counter2++;
            }
        }
       return counter2;
    }

    private static boolean positive(int array[]){
        for (int anArray : array) {
            if (anArray <= 0) {
                return false;
            }
        }
        return true;
    }

    private static int[] back(int array[]){
        int [] array2 = new int[array.length];
        for (int i = array.length -1; i >= 0; i--)
        {
            array2[i] = array[array.length-1-i];
        }
        return array2;
    }
    private static void show(int array[]){
        for (int anArray : array) {
            System.out.print(" " + anArray);
        }
    }

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            int[] array = new int[5];
             double a, b;
            System.out.println("Заполните массив с клавиатуры");
            array=fill(array);
            System.out.println("Сумма элементов = " + sum(array));
            System.out.println("Количество четных чисел = " + even(array));
            System.out.println("Введите границы отрезка");
            a = scan.nextDouble();
            b = scan.nextDouble();
            System.out.println("Количество элементов в отрезке [" + a + ", " + b + "]" + " = " + borders(array, a,b));
            System.out.println("В массиве все числа положительны?: " + positive(array));
            int [] array2 = back(array);
            show(array);
            System.out.println("");
            show(array2);
            scan.close();
        }

}
