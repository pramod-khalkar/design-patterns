package org.design.pattern.structural.decorator.ex3;

/**
 * Date: 13/11/21
 * Time: 1:55 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class ThinCrustPizza extends Pizza {

    public ThinCrustPizza() {
        this.description = "Pizza with thin crust";
    }

    @Override
    public Double cost() {
        return 10d;
    }
}
