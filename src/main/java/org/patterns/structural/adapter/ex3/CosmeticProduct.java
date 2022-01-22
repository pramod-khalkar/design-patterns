package org.patterns.structural.adapter.ex3;

/**
 * Date: 09/11/21
 * Time: 11:27 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class CosmeticProduct implements Product {

    @Override
    public String getName() {
        return "cosmetic product";
    }

    @Override
    public Double getPrice() {
        return 10.2d;
    }
}
