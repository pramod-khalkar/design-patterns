package org.design.pattern.structural.bridge.ex2;

/**
 * Date: 11/11/21
 * Time: 5:40 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}
