package org.patterns.creational.builder.ex4;

/**
 * Date: 04/11/21
 * Time: 6:20 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public Double price() {
        return 100d;
    }
}
