package org.patterns.structural.facade.ex1;

/**
 * Date: 13/11/21
 * Time: 3:18 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class ShapeMaker {
    private final Shape circle, rectangle;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
