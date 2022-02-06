package org.design.pattern.creational.builder.ex1;

/**
 * Date: 02/11/21
 * Time: 1:18 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class CarManualBuilder implements Builder {

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

    public Manual getResult() {
        return new Manual(this.carType, this.seats);
    }
}
