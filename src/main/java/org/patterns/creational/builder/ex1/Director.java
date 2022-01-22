package org.patterns.creational.builder.ex1;

/**
 * Date: 02/11/21
 * Time: 1:20 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Director {

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeates(4);
    }

    public void constructSportCar(Builder builder) {
        builder.setCarType(CarType.SPORT_CAR);
        builder.setSeates(2);
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeates(6);
    }
}
