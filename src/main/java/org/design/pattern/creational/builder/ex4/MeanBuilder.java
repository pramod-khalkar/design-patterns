package org.design.pattern.creational.builder.ex4;

/**
 * Date: 04/11/21
 * Time: 6:28 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class MeanBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        meal.addItem(new Pepsi());
        meal.addItem(new Pizza());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
