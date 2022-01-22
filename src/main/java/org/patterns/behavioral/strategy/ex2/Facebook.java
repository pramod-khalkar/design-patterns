package org.patterns.behavioral.strategy.ex2;

/**
 * Date: 18/11/21
 * Time: 1:03 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Facebook implements Connector {

    @Override
    public void connectTo(String name) {
        System.out.println("Connect with " + name + " using facebook");
    }
}
