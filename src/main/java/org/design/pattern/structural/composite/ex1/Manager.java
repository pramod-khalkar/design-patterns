package org.design.pattern.structural.composite.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 11/11/21
 * Time: 3:00 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Manager implements Employee {
    private final int id;
    private final String name;
    private final double salary;
    List<Employee> employeeList = new ArrayList<>();

    public Manager(int id, String name, double salary) {
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
        System.out.println("--------------------------");
        System.out.printf("Id: %s\n", getId());
        System.out.printf("Name: %s\n", getName());
        System.out.printf("Salary: %s\n", getSalary());
        System.out.println("---------------------------");
        employeeList.forEach(Employee::print);
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employeeList.get(i);
    }
}
