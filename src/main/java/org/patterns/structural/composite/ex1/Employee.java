package org.patterns.structural.composite.ex1;

/**
 * Date: 11/11/21
 * Time: 2:58 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public interface Employee {
    int getId();

    String getName();

    double getSalary();

    void print();

    void addEmployee(Employee employee);

    void removeEmployee(Employee employee);

    Employee getChild(int i);
}
