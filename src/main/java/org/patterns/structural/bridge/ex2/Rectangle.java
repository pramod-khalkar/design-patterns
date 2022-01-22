package org.patterns.structural.bridge.ex2;

/**
 * Date: 11/11/21
 * Time: 6:29 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("drawing rectangle...");
        color.applyColor();
    }
}
