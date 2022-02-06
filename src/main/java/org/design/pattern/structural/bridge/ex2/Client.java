package org.design.pattern.structural.bridge.ex2;

/**
 * Date: 11/11/21
 * Time: 6:30 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {

    public static void main(String[] args) {
        Shape shape = new Triangle(new RedColor());
        shape.draw();

        shape = new Rectangle(new BlackColor());
        shape.draw();
    }
}
