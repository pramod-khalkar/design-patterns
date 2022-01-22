package org.patterns.creational.builder.ex1;

/**
 * Date: 02/11/21
 * Time: 1:12 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class CarBuilder implements Builder {

    private CarType carType;
    private Integer seats;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeates(int seats) {
        this.seats = seats;
    }

    public Car getResult() {
        return new Car(this.carType, this.seats);
    }
}
