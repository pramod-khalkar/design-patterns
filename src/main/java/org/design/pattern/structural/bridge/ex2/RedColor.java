package org.design.pattern.structural.bridge.ex2;

/**
 * Date: 11/11/21
 * Time: 5:38 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class RedColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
