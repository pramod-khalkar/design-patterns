package org.design.pattern.creational.builder.ex4;

/**
 * Date: 04/11/21
 * Time: 8:31 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Pizza implements Item {

    @Override
    public String name() {
        return "Pizza";
    }

    @Override
    public Pack packing() {
        return new Wrapper();
    }

    @Override
    public Double price() {
        return 100d;
    }
}
