package org.design.pattern.structural.adapter.ex3;

/**
 * Date: 09/11/21
 * Time: 3:20 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Rice implements GroceryItem {

    @Override
    public String itemName() {
        return "Rice";
    }

    @Override
    public Double cost() {
        return 30d;
    }
}
