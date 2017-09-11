package imit.student;

import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {
        int sum=0, evenCount=0, borderCount=0;
        boolean positive=true;
        Scanner in = new Scanner(System.in);
        int size = 10, count, changeOrderCount=(size-1);
        int[] arr = new int[size];
        int[] changeOrder = new int[size];
        System.out.println("Введите элементы массива");
        for (count = 0; count < size; count++) {
            int elem = in.nextInt();
            arr[count]=elem;
        }
        System.out.println("Введите границы отрезка на котором будут искаться числа");
        int leftBorder = in.nextInt();
        int rightBorder=in.nextInt();
        System.out.println("Массив");
        for (count = 0; count < size; count++) {
            System.out.print(arr[count] + " ");
            sum+=arr[count];
            if(arr[count]%2==0){
                evenCount++;
            }
            if(arr[count]>=leftBorder && arr[count]<=rightBorder) {
                borderCount++;
            }
            if(arr[count]<0){
                positive=false;
            }
            changeOrder[changeOrderCount]=arr[count];
            changeOrderCount--;
        }
        arr=changeOrder;
        System.out.println("\nМассив в обратном порядке");
        for (count = 0; count < size; count++) {
            System.out.print(arr[count] + " ");
        }
        System.out.println("\nСумма элементов = " + sum);
        System.out.println("В массиве " + evenCount + " чётных чисел");
        System.out.println("К отрезку [" + leftBorder + "," + rightBorder + "] принадлежит " + borderCount + " чисел");
        if(positive){
            System.out.println("Все элементы массива положительные");
        }
        else{
            System.out.println("В массиве есть отрицательные элементы");
        }
    }
}
