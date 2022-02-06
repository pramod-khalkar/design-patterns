package org.design.pattern.creational.builder.ex1;

/**
 * Date: 02/11/21
 * Time: 1:11 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Car {
    private CarType carType;
    private Integer seats;

    Car(CarType carType, Integer seats) {
        this.carType = carType;
        this.seats = seats;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String print(){
        return String.format("Car type : %s , Seats: %s",this.carType,this.seats);
    }
}
