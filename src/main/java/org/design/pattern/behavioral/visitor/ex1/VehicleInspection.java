package org.design.pattern.behavioral.visitor.ex1;

/**
 * Date: 18/11/21
 * Time: 5:22 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class VehicleInspection implements VehicleInspector {

    @Override
    public int visit(Car car) {
        int serviceCharge = 0;
        if (car.getColor().equalsIgnoreCase("white")) {
            serviceCharge = 100;
        } else if (car.getColor().equalsIgnoreCase("black")) {
            serviceCharge = 150;
        }
        return serviceCharge;
    }

    @Override
    public int visit(Bike bike) {
        int serviceCharge = 0;
        if (bike.getEngineCapacity() > 200) {
            serviceCharge = 100;
        } else if (bike.getEngineCapacity() > 400) {
            serviceCharge = 200;
        } else {
            serviceCharge = 300;
        }
        return serviceCharge;
    }

    @Override
    public int visit(Van van) {
        int serviceCharge = 0;
        if (van.getNoOfDoors() > 4) {
            serviceCharge = 100;
        } else if (van.getNoOfDoors() > 6) {
            serviceCharge = 200;
        } else {
            serviceCharge = 150;
        }
        return serviceCharge;
    }
}
