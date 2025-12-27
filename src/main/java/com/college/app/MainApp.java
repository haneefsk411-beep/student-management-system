package com.college.app;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students? ");
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("\nEnter details for Student " + i);

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // clear buffer

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            service.addStudent(new Student(id, name, age));
        }

        System.out.println("\nStudent List:");
        service.displayStudents();

        sc.close();
    }
}
