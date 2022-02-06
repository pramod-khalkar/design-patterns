package org.design.pattern.creational.fp.ex1.shape;

/**
 * Date: 18/10/21
 * Time: 1:09 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Circle implements Shape {
    private Double redius;

    public Circle(Double redius) {
        this.redius = redius;
    }

    public Double getRedius() {
        return redius;
    }

    public void setRedius(Double redius) {
        this.redius = redius;
    }
}
