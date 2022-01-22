package org.patterns.creational.prototype.ex1;

import java.util.Hashtable;

/**
 * Date: 04/11/21
 * Time: 1:46 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeCache = new Hashtable<>();

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId(Circle.ID);
        shapeCache.put(Circle.ID, circle);

        Triangle triangle = new Triangle();
        triangle.setId(Triangle.ID);
        shapeCache.put(Triangle.ID, triangle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId(Rectangle.ID);
        shapeCache.put(Rectangle.ID, rectangle);
    }

    public Shape getShape(String id) throws CloneNotSupportedException {
        Shape shape = shapeCache.get(id);
        return (Shape) shape.clone();
    }
}
