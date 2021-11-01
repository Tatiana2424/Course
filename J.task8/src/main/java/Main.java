import java.util.Scanner;
import java.util.Random;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {


        SalariedEmployee s1 = new SalariedEmployee("Bob", 21, "cgj", 120, 34);
        SalariedEmployee s2 = new SalariedEmployee("Rob", 981, "ydj", 90, 51);
        SalariedEmployee s3 = new SalariedEmployee("David", 481, "cvf", 20, 32);
        ContractEmployee c1 = new ContractEmployee("Georg", 75, "fgcdgh", 456);
        ContractEmployee c2 = new ContractEmployee("Ian", 75, "fgh", 4956);
        ContractEmployee c3 = new ContractEmployee("Jon", 75, "jgh", 3456);
        Employee[] employees = new Employee[]{
                s1, s2, s3, c1, c2, c3
        };
        for (Employee employee : employees) {
            employee.print();
            int t = employee.calculatePay();
            System.out.println(t);
        }
//////////////////////////////////////////////////////////////
        for ( int i = 1; i < employees.length; ++i ) {
            for ( int j = 0; j < i; ++j ) {
                if ( employees[i].calculatePay() < employees[j].calculatePay() ) {
                    Employee tmp = employees[i];
                    for ( int k = i - 1; k >= j; --k )
                        employees[k + 1] = employees[k];
                    employees[j] = tmp;
                }
            }
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("%-32s | %6s | %s\n", "Name", "ID", "Salary");
        System.out.println("------------------------------------------------------------");
        for ( int i = 0; i < employees.length; ++i )
            //employees.print();
            System.out.printf("%-32s | %6d | %7d\n", employees[i].getEmployeeld(), employees[i].getID(), employees[i].calculatePay());
        System.out.println("------------------------------------------------------------");


        }
    }
