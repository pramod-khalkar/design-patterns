package org.patterns.structural.composite.ex1;

/**
 * Date: 11/11/21
 * Time: 3:22 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        Manager manager = new Manager(1, "manager", 10d);

        Cashier cashier = new Cashier(2, "cashier_1", 20d);
        manager.addEmployee(cashier);

        Accountant accountant = new Accountant(3, "accountant", 30d);
        manager.addEmployee(accountant);

        manager.print();
    }
}
