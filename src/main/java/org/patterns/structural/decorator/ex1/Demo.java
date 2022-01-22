package org.patterns.structural.decorator.ex1;

/**
 * Date: 13/11/21
 * Time: 8:58 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        circle = new RedCircle(circle);
        circle.draw();
    }
}
