package org.patterns.behavioral.chain.ex2;

/**
 * Date: 20/11/21
 * Time: 6:40 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Dispenser2000 extends Dispenser {

    public Dispenser2000(Dispenser nextDispenser) {
        this.dispenser = nextDispenser;
    }

    @Override
    void dispense(Integer amount) {
        int noNotes = amount / 2000;
        if (noNotes > 0) {
            System.out.printf("%d notes dispensed of 2000 \n", amount / 2000);
        }
        int remAmt = amount % 2000;
        if (remAmt > 0) {
            this.dispenser.dispense(remAmt);
        }
    }
}
