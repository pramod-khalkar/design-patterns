package org.design.pattern.behavioral.state.ex2;

/**
 * Date: 14/11/21
 * Time: 3:15 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Aknowledged implements PackageState {

    private static final Aknowledged instance = new Aknowledged();

    private Aknowledged() {
    }

    public static Aknowledged getInstance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext deliveryContext) {
        System.out.println("Package is aknowledged");
        deliveryContext.setCurrentPackageState(Shipped.getInstance());
    }
}
