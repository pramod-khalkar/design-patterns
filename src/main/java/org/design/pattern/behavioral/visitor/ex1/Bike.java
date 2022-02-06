package org.design.pattern.behavioral.visitor.ex1;

/**
 * Date: 18/11/21
 * Time: 5:16 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Bike implements Vehicle {

    private String brand;
    private Integer engineCapacity;

    public Bike(String brand, Integer engineCapacity) {
        this.brand = brand;
        this.engineCapacity = engineCapacity;
    }

    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int accept(VehicleInspector vehicleInspector) {
        return vehicleInspector.visit(this);
    }
}
