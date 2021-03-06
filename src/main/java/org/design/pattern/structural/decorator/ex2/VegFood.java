package org.design.pattern.structural.decorator.ex2;

/**
 * Date: 13/11/21
 * Time: 1:40 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class VegFood implements Food {

    @Override
    public String prepareFood() {
        return "Veg food";
    }

    @Override
    public Double price() {
        return 10d;
    }
}
