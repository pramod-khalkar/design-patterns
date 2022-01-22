package org.patterns.structural.bridge.ex3;

/**
 * Date: 11/11/21
 * Time: 6:47 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Car extends Vehicle {

    @Override
    void manufacture() {
        System.out.println("Manufacturing car");
        workshops.forEach(workshop -> workshop.work(this));
        System.out.println("Done");
    }

    @Override
    int minWork() {
        return 10;
    }
}
