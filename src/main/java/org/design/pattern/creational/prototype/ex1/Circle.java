package org.design.pattern.creational.prototype.ex1;

/**
 * Date: 04/11/21
 * Time: 1:38 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Circle extends Shape {

    public static final String ID = "1";

    public Circle() {
        type = "circle";
    }

    @Override
    public void draw() {
        System.out.println("inside circle draw method");
    }
}
