package org.patterns.behavioral.visitor.ex1;

/**
 * Date: 18/11/21
 * Time: 5:19 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Van implements Vehicle {

    private Integer capacity;
    private Integer noOfDoors;

    public Van(Integer capacity, Integer noOfDoors) {
        this.capacity = capacity;
        this.noOfDoors = noOfDoors;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setNoOfDoors(Integer noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public Integer getNoOfDoors() {
        return noOfDoors;
    }

    @Override
    public int accept(VehicleInspector vehicleInspector) {
        return vehicleInspector.visit(this);
    }
}
