package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Insert name: ");
        employee.name = sc.nextLine();
        System.out.print("Insert gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Insert tax value: ");
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.print("\nWhich percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.printf("\nUpdated data: %s, $ %.2f", employee.name, employee.netSalary());

        sc.close();

    }
}
