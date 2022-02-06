package org.design.pattern.structural.adapter.ex3;

/**
 * Date: 09/11/21
 * Time: 11:24 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {

    public static void main(String[] args) {
        ShopInventory shopInventory = new ShopInventory();

        shopInventory.addProduct(new CosmeticProduct());
        shopInventory.addProduct(new FitnessProduct());
        shopInventory.showProduct();

        shopInventory.addProduct(new GroceryItemAdapter(new Sugar()));
        shopInventory.addProduct(new GroceryItemAdapter(new Rice()));

        shopInventory.showProduct();
    }
}
