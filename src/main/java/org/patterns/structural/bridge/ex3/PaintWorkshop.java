package org.patterns.structural.bridge.ex3;

import java.util.concurrent.TimeUnit;

/**
 * Date: 11/11/21
 * Time: 6:52 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class PaintWorkshop extends Workshop {

    public PaintWorkshop() {
        super();
    }

    @Override
    void work(Vehicle vehicle) {
        System.out.println("Painting...");
        long timeTaken = vehicle.minWork() + 300;
        try {
            TimeUnit.MILLISECONDS.sleep(timeTaken);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Time taken: %s,\n", timeTaken);
    }
}
