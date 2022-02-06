package org.design.pattern.behavioral.state.ex2;

/**
 * Date: 15/11/21
 * Time: 5:37 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Shipped implements PackageState{

    private static final Shipped instance = new Shipped();

    private Shipped(){
    }

    public static Shipped getInstance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext deliveryContext) {
        System.out.println("Package is shipped");
        deliveryContext.setCurrentPackageState(InTransition.getInstance());
    }
}
