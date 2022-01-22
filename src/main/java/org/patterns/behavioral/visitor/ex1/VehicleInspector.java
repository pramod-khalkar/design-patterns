package org.patterns.behavioral.visitor.ex1;

/**
 * Date: 18/11/21
 * Time: 5:12 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public interface VehicleInspector {
    int visit(Car car);

    int visit(Bike bike);

    int visit(Van van);
}
