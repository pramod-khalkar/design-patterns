package org.patterns.structural.bridge.ex1;

/**
 * Date: 09/11/21
 * Time: 5:00 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Circle extends Shape {

    private final int x, y, radius;
    private final DrawAPI drawAPI;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.drawAPI = drawAPI;
    }

    @Override
    public void draw() {
        this.drawAPI.drawCircle(this.x, this.y, this.radius);
    }
}
