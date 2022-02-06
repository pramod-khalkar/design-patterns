package org.design.pattern.structural.decorator.ex3;

/**
 * Date: 13/11/21
 * Time: 1:58 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Cheese extends ToppingDecorator {

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " with cheese";
    }

    @Override
    public Double cost() {
        return this.pizza.cost() + 20d;
    }
}
