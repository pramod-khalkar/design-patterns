package org.design.pattern.behavioral.chain.ex2;

/**
 * Date: 20/11/21
 * Time: 6:43 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {

    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.dispenseCash(3200);
    }
}
