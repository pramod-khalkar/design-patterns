package org.design.pattern.behavioral.state.ex2;

/**
 * Date: 17/11/21
 * Time: 9:01 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class OutForDelivery implements PackageState {

    private static final OutForDelivery instance = new OutForDelivery();

    private OutForDelivery() {
    }

    public static OutForDelivery getInstance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext deliveryContext) {
        System.out.println("package is out for delivery");
        deliveryContext.setCurrentPackageState(Delivered.getInstance());
    }
}
