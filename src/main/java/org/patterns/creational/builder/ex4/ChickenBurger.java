package org.patterns.creational.builder.ex4;

/**
 * Date: 04/11/21
 * Time: 6:19 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken burger";
    }

    @Override
    public Double price() {
        return 30.0d;
    }
}
