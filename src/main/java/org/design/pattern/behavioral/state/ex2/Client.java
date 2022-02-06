package org.design.pattern.behavioral.state.ex2;

/**
 * Date: 15/11/21
 * Time: 5:44 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {

    public static void main(String[] args) {
        DeliveryContext deliveryContext = new DeliveryContext(null, "1234");
        deliveryContext.update();
        deliveryContext.update();
        deliveryContext.update();
        deliveryContext.update();
    }

}
