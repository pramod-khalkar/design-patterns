package org.patterns.creational.fp;

import org.pk.ground.design.creational.fp.ex1.calculator.AreaCalculator;
import org.pk.ground.design.creational.fp.ex1.shape.Circle;

/**
 * Date: 02/11/21
 * Time: 10:33 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) throws Exception {
        DefaultAreaCalculatorFactory<Circle> factory = new DefaultAreaCalculatorFactory<>();
        AreaCalculator<Circle> calculator = factory.getCalculator(Circle.class);
        System.out.println(calculator.calculate(new Circle(10d)));
    }
}
