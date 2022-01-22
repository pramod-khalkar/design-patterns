package org.patterns.creational.builder.ex4;

/**
 * Date: 04/11/21
 * Time: 6:31 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        MeanBuilder meanBuilder = new MeanBuilder();
        Meal vegMeal = meanBuilder.prepareVegMeal();
        System.out.printf("%s\nCost:%s", vegMeal.showItems(), vegMeal.getCost());

        Meal nonVegMeal = meanBuilder.prepareNonVegMeal();
        System.out.printf("\n%s\nCost:%s", nonVegMeal.showItems(), nonVegMeal.getCost());
    }
}
