package org.design.pattern.structural.decorator.ex3;

/**
 * Date: 13/11/21
 * Time: 2:02 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {

    public static void main(String[] args) {
        Pizza pizza = new ThickCrustPizza();
        Pizza cheesePizza = new Cheese(pizza);
        Pizza greekPizza = new Olives(cheesePizza);

        System.out.println(greekPizza.getDescription() + " cost: " + greekPizza.cost());
    }
}
