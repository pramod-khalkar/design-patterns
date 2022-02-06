package org.design.pattern.behavioral.visitor.ex1;

/**
 * Date: 18/11/21
 * Time: 5:29 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[] {
                new Bike("TVS", 100),
                new Van(1000, 4),
                new Car("white", 10)
        };

        System.out.println(calculateTotal(vehicles));
    }

    private static int calculateTotal(Vehicle[] vehicles) {
        VehicleInspector vehicleInspector = new VehicleInspection();
        int total = 0;
        for (Vehicle vehicle : vehicles) {
            total = total + vehicle.accept(vehicleInspector);
        }
        return total;
    }
}
