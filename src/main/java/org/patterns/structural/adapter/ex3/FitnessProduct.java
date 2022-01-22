package org.patterns.structural.adapter.ex3;

/**
 * Date: 09/11/21
 * Time: 11:28 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class FitnessProduct implements Product {

    @Override
    public String getName() {
        return "fitness product";
    }

    @Override
    public Double getPrice() {
        return 20.0d;
    }
}
