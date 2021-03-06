package org.design.pattern.behavioral.template.ex2;

/**
 * Date: 19/11/21
 * Time: 4:42 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {

    public static void main(String[] args) {
        OrderProcessor order = new NetOrder();
        order.processOrder();

        order = new StoreOrder();
        order.processOrder();
    }
}
