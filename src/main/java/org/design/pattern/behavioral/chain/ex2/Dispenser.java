package org.design.pattern.behavioral.chain.ex2;

/**
 * Date: 20/11/21
 * Time: 6:25 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public abstract class Dispenser {

    protected Dispenser dispenser;

    public Dispenser() {
    }

    public void setNextDispenser(Dispenser dispenser) {
        this.dispenser = dispenser;
    }

    abstract void dispense(Integer amount);
}
