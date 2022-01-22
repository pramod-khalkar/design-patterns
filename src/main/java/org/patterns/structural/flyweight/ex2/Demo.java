package org.patterns.structural.flyweight.ex2;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Date: 14/11/21
 * Time: 8:27 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    private static final String[] colors = new String[] {"red", "black", "white", "yellow"};
    private static final Random random = new Random();

    public static void main(String[] args) {
        IntStream.range(1, 20).forEach(value -> {
            Circle circle = (Circle) ShapeFactory.getShape(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(getRadius());
            circle.draw();
        });
    }

    private static String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }

    private static int getRandomX() {
        return random.nextInt(100);
    }

    private static int getRandomY() {
        return random.nextInt(200);
    }

    private static int getRadius() {
        return random.nextInt(30);
    }
}
