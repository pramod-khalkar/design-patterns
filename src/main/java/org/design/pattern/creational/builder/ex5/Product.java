package org.design.pattern.creational.builder.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Date: 04/11/21
 * Time: 7:46 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Product {

    List<Packing> items = new ArrayList<>();

    public void addItems(Packing item) {
        items.add(item);
    }

    public String showItems() {
        return items.stream().map(Packing::pack).collect(Collectors.joining(","));
    }

    public double getCost() {
        return items.stream().mapToDouble(Packing::price).sum();
    }
}
