package org.design.pattern.creational.fp.ex1;

import org.design.pattern.creational.fp.ex1.calculator.AreaCalculator;
import org.design.pattern.creational.fp.ex1.shape.Circle;

/**
 * Date: 02/11/21
 * Time: 10:33 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {

    public static void main(String[] args) throws Exception {
        DefaultAreaCalculatorFactory<Circle> factory = new DefaultAreaCalculatorFactory<>();
        AreaCalculator<Circle> calculator = factory.getCalculator(Circle.class);
        System.out.println(calculator.calculate(new Circle(10d)));
    }
}
