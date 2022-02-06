package org.design.pattern.behavioral.chain.ex2;

/**
 * Date: 20/11/21
 * Time: 6:41 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class ATM {

    private Dispenser dispenser;

    public ATM() {
        buildDispenser();
    }

    private void buildDispenser() {
        dispenser = new Dispenser2000(new Dispenser1000(new Dispenser500(new Dispenser100(null))));
    }

    public void dispenseCash(Integer amount) {
        this.dispenser.dispense(amount);
    }
}
