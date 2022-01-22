package org.patterns.structural.decorator.ex2;

/**
 * Date: 13/11/21
 * Time: 1:46 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class ChineseFood extends FoodDecorator {

    public ChineseFood(Food foodE) {
        super(foodE);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with chines";
    }

    @Override
    public Double price() {
        return super.price() + 40d;
    }
}
