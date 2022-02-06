package org.design.pattern.behavioral.template.ex2;

/**
 * Date: 19/11/21
 * Time: 4:32 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public abstract class OrderProcessor {
    abstract boolean isGift();

    abstract void doPayment();

    abstract void doSelect();

    public final void giftWrap() {
        System.out.println("Gift wrap successful");
    }

    abstract void doDelivery();

    public final void processOrder() {
        doSelect();
        doPayment();
        if (isGift()) {
            giftWrap();
        }
        doDelivery();
    }
}
