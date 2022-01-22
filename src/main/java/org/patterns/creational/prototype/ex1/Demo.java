package org.patterns.creational.prototype.ex1;

/**
 * Date: 04/11/21
 * Time: 1:58 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();

        ShapeCache shapeCache = new ShapeCache();
        shapeCache.getShape(Circle.ID).draw();

        shapeCache.getShape(Triangle.ID).draw();
    }
}
