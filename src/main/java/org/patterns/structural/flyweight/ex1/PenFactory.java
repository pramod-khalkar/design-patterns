package org.patterns.structural.flyweight.ex1;

import java.util.HashMap;
import java.util.Map;

/**
 * Date: 14/11/21
 * Time: 6:56 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class PenFactory {

    private static final Map<String, Pen> penMap = new HashMap<>();

    public static Pen getThickPen(String color) {
        String key = color + "-THICK";
        Pen pen = penMap.get(key);
        if (pen != null) {
            return pen;
        } else {
            pen = new ThickPen();
            pen.setColor(color);
            penMap.put(key, pen);
            return pen;
        }
    }

    public static Pen getThinPen(String color) {
        String key = color + "-THIN";
        Pen pen = penMap.get(key);
        if (pen != null) {
            return pen;
        } else {
            pen = new ThinPen();
            pen.setColor(color);
            penMap.put(key, pen);
            return pen;
        }
    }

    public static Pen getMediumPen(String color) {
        String key = color + "-MEDIUM";
        Pen pen = penMap.get(key);
        if (pen != null) {
            return pen;
        } else {
            pen = new MediumPen();
            pen.setColor(color);
            penMap.put(key, pen);
            return pen;
        }
    }
}
