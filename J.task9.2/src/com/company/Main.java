package com.company;
import java.util.Scanner;
public class Main {
    private static int Number;
    public static int ReadNumber(int start, int end)
    {
        if (end < start)
        {
            System.out.println("[end] can not be less than [start]");
        }
        Scanner sc= new Scanner(System.in);
        int input=sc.nextInt();
        int result;
        result = input;

        if (result < start)
        {

            System.out.println("Input can not be less than [start].");
        }
        else if (result > end)
        {
            System.out.println("Input can not be greater than [end].");
        }

        else if (result < Number)
        {
            System.out.println("Input can not be less than [previous number].");
        }
        Number = result;
        return result;
    }
    public static int div(double dividend, double divisor) {
        int result;
        if (divisor == 0.0) {
            return div(1,1);
        } else {
            return result = (int)(dividend / divisor);
        }
    }
    public static void main(String[] args) {
        System.out.print("Dividing:  ");
        System.out.println(div(21, 4));

        Main m = new Main();
        System.out.println("Enter numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.println(m.ReadNumber(1, 100));
        }

    }
}
