package org.patterns.structural.bridge.ex1;

/**
 * Date: 09/11/21
 * Time: 4:57 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class BlackCircle implements DrawAPI {

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.printf("drawing black circle for x:%s, y:%s, radius:%s%n", x, y, radius);
    }
}
