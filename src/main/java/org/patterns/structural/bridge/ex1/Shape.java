package org.patterns.structural.bridge.ex1;

/**
 * Date: 09/11/21
 * Time: 4:57 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public abstract class Shape {
    private DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
