package org.design.pattern.structural.decorator.ex1;

/**
 * Date: 13/11/21
 * Time: 8:51 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class RedCircle extends ShapeDecorator {

    public RedCircle(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedColor(this.decoratorShape);
    }

    private void setRedColor(Shape decoratorShape) {
        System.out.println("Adding red color");
    }
}
