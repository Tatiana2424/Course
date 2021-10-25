package com.company;
import java.util.Scanner;
public class Person {



    private String name;
    private int birthYear;

    Person(){}
    Person(String name,int birthYear){
        this.name=name;
        this.birthYear=birthYear;
    }

         void Age(){
         int year=2021;
         System.out.printf("Age: ");
         System.out.println(year-birthYear);
    }
     void Input(){
        System.out.print("Enter Name: ");
        Scanner sc =new Scanner(System.in);
        name = sc.nextLine();
        System.out.print("Enter birthYear: ");
        birthYear = sc.nextInt();

    }
    void output(){
        System.out.println("Name:"+ name+"      birthYear: "+ birthYear);
    }
    void ChangeName(){
        System.out.print("Change Name: ");
        Scanner sc =new Scanner(System.in);
        name = sc.nextLine();
    }
    public  String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }


}
