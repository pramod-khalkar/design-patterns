package org.patterns.structural.flyweight.ex1;

/**
 * Date: 14/11/21
 * Time: 7:05 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        Pen yellowThinPen = PenFactory.getThinPen("yellow");
        yellowThinPen.draw("Test content");

        Pen yellowThinPen2 = PenFactory.getThinPen("yellow");
        yellowThinPen2.draw("Test content with test2");
    }
}
