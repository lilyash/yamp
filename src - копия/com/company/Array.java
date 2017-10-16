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
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];

        }
        return sum;
    }

    private static int even(int array[]){
        int counter=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int borders(int array[], double a, double b){
        int counter2=0;
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < array.length; i++)
        {
            if(array[i]>=a && array[i]<=b)
            {
                counter2++;
            }
        }
       return counter2;
    }
    private static boolean positive(int array[]){
        for(int i = 0; i < array.length; i++)
        {
            if(array[i]<=0)
            {
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
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(" " + array[i]);
        }
    }

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            int[] array = new int[10];
            int sum;
            int counter;
            int counter2;
            boolean flag = false;
            double a, b;
            System.out.println("Заполните массив с клавиатуры");
            array=fill(array);
            sum=sum(array);
            System.out.println("Сумма элементов = " + sum);
            counter = even(array);
            System.out.println("Количество четных чисел = " + counter);
            System.out.println("Введите границы отрезка");
            a = scan.nextDouble();
            b = scan.nextDouble();
            counter2 = borders(array, a,b);
            System.out.println("Количество элементов в отрезке [ " + a + " , " + b + " ]" + " = " + counter2);
            flag=positive(array);
            if(flag)
            {
                System.out.println("В массиве все числа положительны");
            }
            else
            {
                System.out.println("В массиве не все числа положительны");
            }
            int [] array2 = back(array);
            show(array);
            System.out.println("");
            show(array2);
        }

}
