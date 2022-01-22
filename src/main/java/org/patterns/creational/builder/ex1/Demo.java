package org.patterns.creational.builder.ex1;

/**
 * Date: 02/11/21
 * Time: 1:23 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructCityCar(carBuilder);
        System.out.println(carBuilder.getResult().print());


        director.constructSportCar(carBuilder);
        System.out.println(carBuilder.getResult().print());
    }
}
