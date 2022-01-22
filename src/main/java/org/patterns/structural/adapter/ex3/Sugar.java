package org.patterns.structural.adapter.ex3;

/**
 * Date: 09/11/21
 * Time: 3:19 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Sugar implements GroceryItem {

    @Override
    public String itemName() {
        return "SUgar";
    }

    @Override
    public Double cost() {
        return 100d;
    }
}
