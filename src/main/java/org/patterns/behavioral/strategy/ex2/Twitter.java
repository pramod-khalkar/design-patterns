package org.patterns.behavioral.strategy.ex2;

/**
 * Date: 18/11/21
 * Time: 1:08 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Twitter implements Connector {

    @Override
    public void connectTo(String name) {
        System.out.println("connect with " + name + " using twitter");
    }
}
