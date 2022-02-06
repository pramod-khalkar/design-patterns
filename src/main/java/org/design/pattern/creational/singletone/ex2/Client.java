package org.design.pattern.creational.singletone.ex2;

import java.util.Random;

/**
 * Date: 05/11/21
 * Time: 6:49 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {
    private static Random random = new Random();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
                threadSafeSingleton.setTestNumber(random.nextInt(80));
                sleep(2000);
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
                threadSafeSingleton.showNumber();
                sleep(2000);
            }
        });

        t2.start();
        t1.start();
    }

    //This is to pause for time being
    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
