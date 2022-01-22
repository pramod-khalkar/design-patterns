package org.patterns.structural.decorator.ex3;

/**
 * Date: 13/11/21
 * Time: 2:01 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Olives extends ToppingDecorator {

    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " with olives";
    }

    @Override
    public Double cost() {
        return this.pizza.cost() + 20d;
    }
}
