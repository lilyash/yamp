package com.company;

import java.util.Scanner;
public class Array {

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            int[] array = new int[10];
            int sum=0;
            int counter=0;
            int counter2 =0;
            boolean flag = false;
            double a, b;
            System.out.println("Заполните массив с клавиатуры");
            for (int i = 0; i < array.length; i++)
            {
                array[i] = scan.nextInt();
            }
            for (int i = 0; i < array.length; i++)
            {
                sum += array[i];
                if(array[i]%2==0)
                {
                    counter++;
                }
            }
            System.out.println("Сумма элементов = " + sum);
            System.out.println("Количество четных чисел = " + counter);
            System.out.println("Введите границы отрезка");
            a = scan.nextDouble();
            b = scan.nextDouble();
            for(int i = 0; i < array.length; i++)
            {
                if(array[i]>=a && array[i]<=b)
                {
                    counter2++;
                }
            }
            System.out.println("Количество элементов в отрезке [ " + a + " , " + b + " ]" + " = " + counter2);
            for(int i = 0; i < array.length; i++)
            {
                if(array[i]<0)
                {
                    flag = true;
                }
            }
            if(flag)
            {
                System.out.println("В массиве не все числа положительны");
            }
            else
            {
                System.out.println("В массиве все числа положительны");
            }
            int [] array2 = new int[10];
            for (int i = array.length -1; i >= 0; i--)
            {
                array2[i] = array[array.length-1-i];
            }
            array = array2;
            for(int i = 0; i < array.length; i++)
            {
                System.out.print(" " + array[i]);
            }
        }

}
