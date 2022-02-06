package org.design.pattern.creational.singletone.ex2;

/**
 * Date: 05/11/21
 * Time: 6:41 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance = new ThreadSafeSingleton();
    private Integer testNumber;

    private ThreadSafeSingleton() {
        testNumber = 0;
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                instance = new ThreadSafeSingleton();
            }
        }
        return instance;
    }

    public void showNumber() {
        System.out.printf("\nNumber: %s", this.testNumber);
    }

    public Integer getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(Integer testNumber) {
        System.out.printf("\nNumber changed to: %s", this.testNumber);
        this.testNumber = testNumber;
    }
}
