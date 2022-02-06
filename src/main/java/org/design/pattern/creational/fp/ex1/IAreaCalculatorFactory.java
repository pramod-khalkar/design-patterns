package org.design.pattern.creational.fp.ex1;

import org.design.pattern.creational.fp.ex1.calculator.AreaCalculator;

/**
 * Date: 18/10/21
 * Time: 1:25 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public interface IAreaCalculatorFactory<T> {
    void addCalculator(Class<? extends T> shape, AreaCalculator<T> iAreaCalculator) throws Exception;

    void removeCalculator(Class<? extends T> shape);

    AreaCalculator<T> getCalculator(Class<? extends T> shape) throws Exception;
}
