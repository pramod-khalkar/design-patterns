package org.patterns.structural.bridge.ex2;

/**
 * Date: 11/11/21
 * Time: 5:40 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class BlackColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("Applying black color");
    }
}
