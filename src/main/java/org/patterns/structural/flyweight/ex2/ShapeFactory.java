package org.patterns.structural.flyweight.ex2;

import java.util.HashMap;
import java.util.Map;

/**
 * Date: 14/11/21
 * Time: 8:24 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class ShapeFactory {

    private static final Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String color) {
        Shape circle = shapeMap.get(color);
        if (circle != null) {
            return circle;
        } else {
            circle = new Circle(color);
            shapeMap.put(color, circle);
            System.out.printf("creating circle of %s \n", color);
            return circle;
        }
    }
}
