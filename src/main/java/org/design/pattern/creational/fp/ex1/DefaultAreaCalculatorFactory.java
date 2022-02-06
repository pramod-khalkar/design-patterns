package org.design.pattern.creational.fp.ex1;

import java.util.HashMap;
import java.util.Map;
import org.design.pattern.creational.fp.ex1.calculator.CircleAreaCalculator;
import org.design.pattern.creational.fp.ex1.calculator.AreaCalculator;
import org.design.pattern.creational.fp.ex1.calculator.ReactangleAreaCalculator;
import org.design.pattern.creational.fp.ex1.calculator.TriangleAreaCalculator;
import org.design.pattern.creational.fp.ex1.shape.Circle;
import org.design.pattern.creational.fp.ex1.shape.Reactangle;
import org.design.pattern.creational.fp.ex1.shape.Triangle;

/**
 * Date: 18/10/21
 * Time: 1:29 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class DefaultAreaCalculatorFactory<T> implements IAreaCalculatorFactory<T> {

    private final Map<Class<?>, AreaCalculator<?>> calculatorMap = new HashMap<>();

    public DefaultAreaCalculatorFactory() {
        calculatorMap.put(Circle.class, new CircleAreaCalculator());
        calculatorMap.put(Triangle.class, new TriangleAreaCalculator());
        calculatorMap.put(Reactangle.class, new ReactangleAreaCalculator());
    }

    @Override
    public void addCalculator(Class<? extends T> shape, AreaCalculator<T> iAreaCalculator) throws Exception {
        if (!calculatorMap.containsKey(shape)) {
            calculatorMap.put(shape, iAreaCalculator);
        } else {
            throw new Exception("Already exist");
        }
    }

    @Override
    public void removeCalculator(Class<? extends T> shape) {
        calculatorMap.remove(shape);
    }

    @Override
    public AreaCalculator<T> getCalculator(Class<? extends T> shape) throws Exception {
        AreaCalculator<T> iAreaCalculator = (AreaCalculator<T>) calculatorMap.get(shape);
        if (iAreaCalculator == null) {
            throw new Exception("Calculator not found");
        }
        return iAreaCalculator;
    }
}
