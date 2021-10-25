package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Person person1=new Person("Anna",2003);
	//person1.Input();
    person1.output();
    person1.Age();
    person1.ChangeName();
    person1.output();
    System.out.printf("\n");

    Person person2=new Person("Bob",2001);
   // person2.Input();
    person2.output();
    person2.Age();
    person2.ChangeName();
    person2.output();
    System.out.printf("\n");

    Person person3=new Person("David",2002);
    // person3.Input();
    person3.output();
    person3.Age();
    person3.ChangeName();
    person3.output();
    System.out.printf("\n");


    Person person4=new Person("Monica",1999);
    // person4.Input();
    person4.output();
    person4.Age();
    person4.ChangeName();
    person4.output();
    System.out.printf("\n");

    Person person5=new Person("Lola",1988);
    // person4.Input();
    person5.output();
    person5.Age();
    person5.ChangeName();
    person5.output();


}
}
