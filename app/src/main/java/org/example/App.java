package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Abhishek"));
        students.add(new Student(2, "leonel"));
        students.add(new Student(3, "messi"));

        System.out.println("===== Student Management System =====");

        students.forEach(System.out::println);
    }
}
