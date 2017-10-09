package com.company;
import java.util.Scanner;
public class three {
        public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d;
            double e,f;
            d = a * b * c;
            e = (float)(a + b + c) / 3;
            System.out.println(d);
            System.out.println(e);
            if ((a < b) && (a < c))
            {
                if (b < c)
                {
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                }
                else
                {
                    System.out.println(a);
                    System.out.println(c);
                    System.out.println(b);
                }
            }
            else
            {
                if (b < c)
                {
                    if (c < a)
                    {
                        System.out.println(b);
                        System.out.println(c);
                        System.out.println(a);
                    }
                    else
                    {
                        System.out.println(b);
                        System.out.println(a);
                        System.out.println(c);
                    }
                }
                else
                {
                    if (b < a)
                    {
                        System.out.println(c);
                        System.out.println(b);
                        System.out.println(a);
                    }
                    else
                    {
                        System.out.println(c);
                        System.out.println(a);
                        System.out.println(b);
                    }
                }
            }
        }

}
