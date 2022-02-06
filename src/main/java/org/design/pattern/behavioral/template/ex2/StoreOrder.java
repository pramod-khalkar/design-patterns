package org.design.pattern.behavioral.template.ex2;

/**
 * Date: 19/11/21
 * Time: 4:40 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class StoreOrder extends OrderProcessor {

    @Override
    boolean isGift() {
        return true;
    }

    @Override
    void doPayment() {
        System.out.println("payment completed");
    }

    @Override
    void doSelect() {
        System.out.println("store shopping so no selection");
    }

    @Override
    void doDelivery() {
        System.out.println("Item delivered");
    }
}
