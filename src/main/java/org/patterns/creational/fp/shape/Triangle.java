package org.patterns.creational.fp.shape;

/**
 * Date: 18/10/21
 * Time: 1:17 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Triangle implements Shape {
    private Double height;
    private Double width;
    private Double length;

    public Triangle(Double height, Double width, Double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
}
