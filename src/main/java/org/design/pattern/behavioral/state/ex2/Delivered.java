package org.design.pattern.behavioral.state.ex2;

/**
 * Date: 17/11/21
 * Time: 9:03 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Delivered implements PackageState {

    private static final Delivered instance = new Delivered();

    private Delivered() {
    }

    public static Delivered getInstance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext deliveryContext) {
        System.out.println("Package delivered");
    }
}
