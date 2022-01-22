package org.patterns.creational.fp.calculator;

import org.pk.ground.design.creational.fp.ex1.shape.Circle;

/**
 * Date: 18/10/21
 * Time: 1:19 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class CircleAreaCalculator implements AreaCalculator<Circle> {

    @Override
    public Double calculate(Circle shape) {
        return Math.sqrt(shape.getRedius()) * 3.14;
    }
}
