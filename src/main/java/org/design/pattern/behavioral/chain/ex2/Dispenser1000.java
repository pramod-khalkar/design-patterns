package org.design.pattern.behavioral.chain.ex2;

/**
 * Date: 20/11/21
 * Time: 6:39 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Dispenser1000 extends Dispenser {

    public Dispenser1000(Dispenser nextDispenser) {
        this.dispenser = nextDispenser;
    }

    @Override
    void dispense(Integer amount) {
        int noNotes = amount / 1000;
        if(noNotes > 0){
            System.out.printf("%d notes dispensed of 1000 \n", amount / 1000);
        }
        int remAmt = amount % 1000;
        if (remAmt > 0) {
            this.dispenser.dispense(remAmt);
        }
    }
}
