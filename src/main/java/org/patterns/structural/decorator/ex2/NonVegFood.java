package org.patterns.structural.decorator.ex2;

/**
 * Date: 13/11/21
 * Time: 1:42 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class NonVegFood extends FoodDecorator {

    public NonVegFood(Food food) {
        super(food);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with chicken";
    }

    @Override
    public Double price() {
        return super.price() + 20d;
    }
}
