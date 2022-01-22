package org.patterns.structural.decorator.ex1;

/**
 * Date: 13/11/21
 * Time: 8:49 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        this.decoratorShape.draw();
    }
}
