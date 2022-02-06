package org.design.pattern.structural.decorator.ex2;

/**
 * Date: 13/11/21
 * Time: 1:41 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public abstract class FoodDecorator implements Food {
    private final Food food;

    public FoodDecorator(Food food) {
        this.food = food;
    }

    @Override
    public String prepareFood() {
        return food.prepareFood();
    }

    @Override
    public Double price() {
        return food.price();
    }
}
