package org.patterns.behavioral.state.ex2;

/**
 * Date: 15/11/21
 * Time: 5:39 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class InTransition implements PackageState {

    private static final InTransition instance = new InTransition();

    private InTransition() {
    }

    public static InTransition getInstance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext deliveryContext) {
        System.out.println("Package is in transition");
        deliveryContext.setCurrentPackageState(OutForDelivery.getInstance());
    }
}
