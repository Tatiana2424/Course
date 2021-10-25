package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.printf("1)\n");
        System.out.printf("print R=");
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        float S;
        float P;
        S= (float) (Math.PI*R*R);
        P=(float) (Math.PI*2*R);
        System.out.println("P="+P);
        System.out.println("S="+S);
        ///////////////////////////////////
        System.out.printf("2)\n");
        System.out.println("What is your name?");
        Scanner n = new Scanner(System.in);
        String name = n.nextLine();
        System.out.println("Where are you live,"+ name+"?");
        String address = n.nextLine();
        System.out.println("Name: "+name+"     "+"Address: "+address);
        ///////////////////////////////////
        System.out.printf("3)\n");
        System.out.printf("C1= ");
        int c1 = sc.nextInt();
        System.out.printf("C2= ");
        int c2 = sc.nextInt();
        System.out.printf("C3= ");
        int c3 = sc.nextInt();
        System.out.printf("T1= ");
        int t1 = sc.nextInt();
        System.out.printf("T2= ");
        int t2 = sc.nextInt();
        System.out.printf("T3= ");
        int t3 = sc.nextInt();
        int C1=c1*t1;
        int C2=c2*t2;
        int C3=c3*t3;
        int all=C1+C2+C3;
        System.out.println("Count for C1= "+C1);
        System.out.println("Count for C2= "+C2);
        System.out.println("Count for C3= "+C3);
        System.out.println("Count for all= "+all);



    }
}
