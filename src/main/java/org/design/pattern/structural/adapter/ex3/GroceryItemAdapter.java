package org.design.pattern.structural.adapter.ex3;

/**
 * Date: 09/11/21
 * Time: 3:21 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class GroceryItemAdapter implements Product {

    private GroceryItem groceryItem;

    public GroceryItemAdapter(GroceryItem groceryItem) {
        this.groceryItem = groceryItem;
    }

    @Override
    public String getName() {
        return groceryItem.itemName();
    }

    @Override
    public Double getPrice() {
        return groceryItem.cost();
    }
}
