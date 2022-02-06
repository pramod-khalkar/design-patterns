package org.design.pattern.creational.builder.ex4;

/**
 * Date: 04/11/21
 * Time: 6:20 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public Double price() {
        return 150d;
    }
}
