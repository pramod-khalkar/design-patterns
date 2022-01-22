package org.patterns.creational.builder.ex4;

/**
 * Date: 04/11/21
 * Time: 6:17 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public abstract class ColdDrink implements Item {

    @Override
    public Pack packing() {
        return new Bottle();
    }
}
