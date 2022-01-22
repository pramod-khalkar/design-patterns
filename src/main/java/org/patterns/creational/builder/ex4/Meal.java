package org.patterns.creational.builder.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Date: 04/11/21
 * Time: 6:21 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Meal {

    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public Double getCost() {
        return items.stream().mapToDouble(Item::price).sum();
    }

    public String showItems() {
        return String.format("Total items: %s", items.stream().map(Item::name).collect(Collectors.joining(",")));
    }
}
