package org.patterns.structural.decorator.ex2;

/**
 * Date: 13/11/21
 * Time: 1:47 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        Food vegFood = new VegFood();
        System.out.println(vegFood.prepareFood());

        Food nonVegFood = new NonVegFood(vegFood);
        System.out.println(nonVegFood.prepareFood());

        Food chinesFood = new ChineseFood(vegFood);
        System.out.println(chinesFood.prepareFood());
    }
}
