package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int k;
        int n1;
        int count=0;
        int res;
        int num;
        int num1;

        int w=1;
        System.out.print("n=");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        num=n;
        num1=n;
        System.out.println("n^2="+(n*n));

        int n2;
        n2 = n * n;
        boolean l;
        l=false;
        while ((n2 != 0) && (l != true))
        {
            if (n2 % 10 == 3)  l = true;
            n2 = n2 / 10;

        }
        if (l == true)
            System.out.println("3 is in this number");
        else
            System.out.println("3 is not in this number");
        ///////////////////////////////////
        System.out.print("Reverse order: ");
        while (n != 0) {
            k = n % 10;
            n = n / 10;
            System.out.print(k);
        }
        System.out.print("\n");
        ///////////////////////////////////
        int  a, b = 0, p = 1;
        a = num % 10;
        num = num / 10;
        while (num > 9) {
            a *= 10;
            b += (num % 10) * p;
            p *= 10;
            num /= 10;
        }
        num = (a * 10) + (b * 10) + num;
        System.out.print("Changed the first and last digits: ");
        System.out.println(num);


        //////////////////////////////////
        n1 = num1;

        while (num1!=0)
        {
            num1 /= 10;
            count++;
        }

        do
        {
            w*= 10;
            count--;
        } while (count >= 0);

        res = w + n1 * 10 + 1;
        System.out.print("With adding to the end and beginning 1: ");
        System.out.println(res);

    }
}
