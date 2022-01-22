package org.patterns.structural.bridge.ex1;

/**
 * Date: 09/11/21
 * Time: 5:04 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(10, 20, 5, new RedCircle());
        Shape blackCircle = new Circle(20, 30, 4, new BlackCircle());

        redCircle.draw();
        blackCircle.draw();
    }
}
