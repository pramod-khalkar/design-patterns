package org.design.pattern.creational.prototype.ex1;

/**
 * Date: 04/11/21
 * Time: 1:58 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();

        ShapeCache shapeCache = new ShapeCache();
        shapeCache.getShape(Circle.ID).draw();

        shapeCache.getShape(Triangle.ID).draw();
    }
}
