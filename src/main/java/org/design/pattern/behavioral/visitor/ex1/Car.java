package org.design.pattern.behavioral.visitor.ex1;

/**
 * Date: 18/11/21
 * Time: 5:14 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Car implements Vehicle {

    private String color;
    private Integer manufactureDate;

    public Car(String color, Integer manufactureDate) {
        this.color = color;
        this.manufactureDate = manufactureDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Integer manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public int accept(VehicleInspector vehicleInspector) {
        return vehicleInspector.visit(this);
    }
}
