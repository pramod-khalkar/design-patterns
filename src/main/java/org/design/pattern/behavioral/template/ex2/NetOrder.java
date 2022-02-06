package org.design.pattern.behavioral.template.ex2;

/**
 * Date: 19/11/21
 * Time: 4:38 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class NetOrder extends OrderProcessor {

    @Override
    boolean isGift() {
        return true;
    }

    @Override
    void doPayment() {
        System.out.println("Payment completed");
    }

    @Override
    void doSelect() {
        System.out.println("Select from options");
    }

    @Override
    void doDelivery() {
        System.out.println("Item delivered");
    }
}
