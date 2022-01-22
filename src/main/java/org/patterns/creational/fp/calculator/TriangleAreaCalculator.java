package org.patterns.creational.fp.calculator;

import org.pk.ground.design.creational.fp.ex1.shape.Triangle;

/**
 * Date: 18/10/21
 * Time: 1:21 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class TriangleAreaCalculator implements AreaCalculator<Triangle> {

    @Override
    public Double calculate(Triangle shape) {
        return shape.getHeight() * shape.getLength() * shape.getLength();
    }
}
