package org.design.pattern.creational.fp.ex1.calculator;

import org.design.pattern.creational.fp.ex1.shape.Reactangle;

/**
 * Date: 18/10/21
 * Time: 1:22 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class ReactangleAreaCalculator implements AreaCalculator<Reactangle> {

    @Override
    public Double calculate(Reactangle shape) {
        return shape.getLength() * shape.getWidth();
    }
}
