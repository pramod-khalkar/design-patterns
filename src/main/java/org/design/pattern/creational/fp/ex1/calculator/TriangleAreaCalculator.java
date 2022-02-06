package org.design.pattern.creational.fp.ex1.calculator;

import org.design.pattern.creational.fp.ex1.shape.Triangle;

/**
 * Date: 18/10/21
 * Time: 1:21 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class TriangleAreaCalculator implements AreaCalculator<Triangle> {

    @Override
    public Double calculate(Triangle shape) {
        return shape.getHeight() * shape.getLength() * shape.getLength();
    }
}
