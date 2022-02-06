package org.design.pattern.creational.singletone.ex1;

import java.util.Random;

/**
 * Date: 05/11/21
 * Time: 6:22 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Singleton {

    private static Singleton instance = new Singleton();
    private final Integer number;

    public Singleton() {
        number = new Random().nextInt();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void show() {
        System.out.printf("\nSingletone test %s", this.number);
    }
}
