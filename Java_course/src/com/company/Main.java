package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int a,b,c,x,y;
	System.out.print("a=");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	System.out.print("b=");
	b=sc.nextInt();
	System.out.print("c=");
	c=sc.nextInt();
	System.out.print("x=");
	x=sc.nextInt();
	System.out.print("y=");
	y=sc.nextInt();

	if((x>a && y>b) ||(x>b && y>a)){
		System.out.println("the brick will pass");
	}
	else if((x>a && y>c) ||(x>c && y>a)){
		System.out.println("the brick will pass");
	}
	else if((x>b && y>c) ||(x>c && y>b)){
		System.out.println("the brick will pass");
	}
	else{
		System.out.println("the brick will not pass");
	}
    }
}
