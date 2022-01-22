package org.patterns.structural.bridge.ex3;

import java.util.concurrent.TimeUnit;

/**
 * Date: 11/11/21
 * Time: 6:49 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class ProduceWorkshop extends Workshop {

    public ProduceWorkshop() {
        super();
    }

    @Override
    void work(Vehicle vehicle) {
        System.out.println("Producing");
        long timeTaken = vehicle.minWork() + 300;
        try {
            TimeUnit.MICROSECONDS.sleep(timeTaken);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Time taken millis: %s,\n", timeTaken);
    }
}
