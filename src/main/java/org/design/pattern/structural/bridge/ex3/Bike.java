package org.design.pattern.structural.bridge.ex3;

/**
 * Date: 11/11/21
 * Time: 6:45 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Bike extends Vehicle {

    @Override
    void manufacture() {
        System.out.println("Manufacturing bike..");
        workshops.forEach(workshop -> workshop.work(this));
        System.out.println("Done");
    }

    @Override
    int minWork() {
        return 5;
    }
}
