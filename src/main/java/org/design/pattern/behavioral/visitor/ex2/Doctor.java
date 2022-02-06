package org.design.pattern.behavioral.visitor.ex2;

/**
 * Date: 19/11/21
 * Time: 3:52 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Doctor implements Visitor {

    private final String name;

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void visit(Student student) {
        student.setHealthStatus("good");
        System.out.printf("Doctor %s checked the health of %s and health status is good so updated it \n", this.name, student.getName());
    }
}
