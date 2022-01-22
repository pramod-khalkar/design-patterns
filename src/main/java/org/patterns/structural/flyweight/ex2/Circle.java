package org.patterns.structural.flyweight.ex2;

/**
 * Date: 14/11/21
 * Time: 8:22 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Circle implements Shape {

    private int x, y, radius;
    private final String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing with %s , with coordinates %d , %d , radius : %d \n", this.color, this.x, this.y, this.radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
