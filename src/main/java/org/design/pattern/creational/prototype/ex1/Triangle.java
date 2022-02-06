package org.design.pattern.creational.prototype.ex1;

/**
 * Date: 04/11/21
 * Time: 1:42 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Triangle extends Shape {

    public static final String ID = "2";

    public Triangle() {
        type = "Triangle";
    }

    @Override
    public void draw() {
        System.out.println("inside triangle draw method");
    }
}
