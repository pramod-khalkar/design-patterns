package org.patterns.creational.prototype.ex1;

/**
 * Date: 04/11/21
 * Time: 1:40 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Rectangle extends Shape {

    public static final String ID = "3";

    public Rectangle() {
        type = "Retangle";
    }

    @Override
    public void draw() {
        System.out.println("inside rectangle draw method");
    }
}
