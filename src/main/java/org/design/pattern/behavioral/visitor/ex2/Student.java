package org.design.pattern.behavioral.visitor.ex2;

/**
 * Date: 19/11/21
 * Time: 3:48 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Student implements Visitable {

    private final String name;
    private String healthStatus;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
