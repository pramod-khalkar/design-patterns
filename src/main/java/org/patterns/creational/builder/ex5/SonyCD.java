package org.patterns.creational.builder.ex5;

/**
 * Date: 04/11/21
 * Time: 7:43 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class SonyCD extends Company {

    @Override
    public String pack() {
        return "Sony CD";
    }

    @Override
    public float price() {
        return 1.0f;
    }
}
