package org.design.pattern.structural.adapter.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Date: 09/11/21
 * Time: 11:21 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class ShopInventory {

    private List<Product> list;

    public ShopInventory() {
        this.list = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.list.add(product);
    }

    public Product removeProduct(Product product) {
        this.list.remove(product);
        return product;
    }

    public int count() {
        return list.size();
    }

    public void showProduct() {
        System.out.println(list.stream().map(Product::getName).collect(Collectors.joining(",")));
    }
}
