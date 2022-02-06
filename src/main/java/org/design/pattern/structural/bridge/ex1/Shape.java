package org.design.pattern.structural.bridge.ex1;

/**
 * Date: 09/11/21
 * Time: 4:57 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public abstract class Shape {
    private DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
