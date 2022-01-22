package org.patterns.structural.composite.ex1;

/**
 * Date: 11/11/21
 * Time: 3:19 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Accountant implements Employee {

    private final int id;
    private final String name;
    private final double salary;

    public Accountant(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void print() {
        System.out.println("------------------");
        System.out.printf("Id: %s\n", getId());
        System.out.printf("Name: %s\n", getName());
        System.out.printf("Salary: %s\n", getSalary());
        System.out.println("------------------_");
    }

    @Override
    public void addEmployee(Employee employee) {
        //Not supported
    }

    @Override
    public void removeEmployee(Employee employee) {
        //Not supported
    }

    @Override
    public Employee getChild(int i) {
        //Not supported
        return null;
    }
}
