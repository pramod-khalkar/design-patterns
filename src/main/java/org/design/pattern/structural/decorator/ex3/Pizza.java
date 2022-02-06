package org.design.pattern.structural.decorator.ex3;

/**
 * Date: 13/11/21
 * Time: 1:53 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public abstract class Pizza {
    String description = "basic pizza";

    public String getDescription() {
        return this.description;
    }

    public abstract Double cost();
}
