package org.design.pattern.structural.decorator.ex1;

/**
 * Date: 13/11/21
 * Time: 8:57 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class BlackRectangle extends ShapeDecorator {

    public BlackRectangle(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        super.draw();
        setBlackColor(this.decoratorShape);
    }

    private void setBlackColor(Shape decoratorShape) {
        System.out.println("adding black color");
    }
}
