package org.design.pattern.structural.bridge.ex2;

/**
 * Date: 11/11/21
 * Time: 6:27 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing triangle...");
        color.applyColor();
    }
}
