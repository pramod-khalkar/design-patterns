package org.patterns.creational.builder.ex4;

/**
 * Date: 04/11/21
 * Time: 6:18 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg burger";
    }

    @Override
    public Double price() {
        return 10.0d;
    }
}
