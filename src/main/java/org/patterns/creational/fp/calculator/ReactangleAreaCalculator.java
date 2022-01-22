package org.patterns.creational.fp.calculator;

import org.pk.ground.design.creational.fp.ex1.shape.Reactangle;

/**
 * Date: 18/10/21
 * Time: 1:22 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class ReactangleAreaCalculator implements AreaCalculator<Reactangle> {

    @Override
    public Double calculate(Reactangle shape) {
        return shape.getLength() * shape.getWidth();
    }
}
