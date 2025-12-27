package com.college.app;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("ID | Name | Age");
        System.out.println("----------------");
        for (Student s : students) {
            System.out.println(
                s.getId() + " | " + s.getName() + " | " + s.getAge()
            );
        }
    }
}
