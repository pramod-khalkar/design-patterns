package org.patterns.behavioral.visitor.ex1;

/**
 * Date: 18/11/21
 * Time: 5:13 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public interface Vehicle {
    int accept(VehicleInspector vehicleInspector);
}
