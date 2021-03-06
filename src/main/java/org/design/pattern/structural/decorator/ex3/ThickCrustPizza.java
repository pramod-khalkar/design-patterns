package org.design.pattern.structural.decorator.ex3;

/**
 * Date: 13/11/21
 * Time: 1:56 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class ThickCrustPizza extends Pizza {

    public ThickCrustPizza() {
        this.description = "Thick crust pizza";
    }

    @Override
    public Double cost() {
        return 30d;
    }
}
