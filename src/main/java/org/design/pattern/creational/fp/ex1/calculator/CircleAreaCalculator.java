package org.design.pattern.creational.fp.ex1.calculator;

import org.design.pattern.creational.fp.ex1.shape.Circle;

/**
 * Date: 18/10/21
 * Time: 1:19 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class CircleAreaCalculator implements AreaCalculator<Circle> {

    @Override
    public Double calculate(Circle shape) {
        return Math.sqrt(shape.getRedius()) * 3.14;
    }
}
