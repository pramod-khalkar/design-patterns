package org.design.pattern.behavioral.visitor.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 19/11/21
 * Time: 3:55 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class School {

    private static final List<Student> students;

    static {
        students = new ArrayList<>();
        students.add(new Student("Pramod"));
        students.add(new Student("Madhuri"));
        students.add(new Student("Nikita"));
        students.add(new Student("Pooja"));
    }

    public static void doHealthCheck() {
        Doctor doctor = new Doctor("Dr.Sonu");
        students.forEach(student -> student.accept(doctor));
    }
}
