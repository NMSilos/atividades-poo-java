package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Insert name: ");
        student.name = sc.nextLine();

        System.out.print("Insert 1° grade: ");
        student.g1 = sc.nextDouble();

        System.out.print("Insert 2° grade: ");
        student.g2 = sc.nextDouble();

        System.out.print("Insert 3° grade: ");
        student.g3 = sc.nextDouble();

        System.out.println(student.toString());
        student.situation();

        sc.close();

    }
}
