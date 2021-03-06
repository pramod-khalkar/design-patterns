package org.design.pattern.creational.builder.ex4;

/**
 * Date: 04/11/21
 * Time: 6:14 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public abstract class Burger implements Item {

    @Override
    public Pack packing() {
        return new Wrapper();
    }
}
