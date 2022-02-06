package org.design.pattern.structural.bridge.ex1;

/**
 * Date: 09/11/21
 * Time: 4:54 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.printf("drawing red circle for x:%s, y:%s, radius:%s%n", x, y, radius);
    }
}
