package org.patterns.structural.adapter.ex1;

/**
 * Date: 08/11/21
 * Time: 5:46 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        GermanSocket germanSocket = new GermanSocket();
        germanSocket.plugIn(() -> {
        });

        IndianSocket indianSocket = new IndianSocket();
        indianSocket.plugIn(new GermanToIndiaAdapter(() -> {
        }));
    }
}
