package org.patterns.creational.fp.shape;

/**
 * Date: 18/10/21
 * Time: 1:14 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Reactangle implements Shape {
    private Double width;
    private Double length;

    public Reactangle(Double width, Double length) {
        this.width = width;
        this.length = length;
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
