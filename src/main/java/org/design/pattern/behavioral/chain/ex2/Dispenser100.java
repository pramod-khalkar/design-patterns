package org.design.pattern.behavioral.chain.ex2;

/**
 * Date: 20/11/21
 * Time: 6:29 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Dispenser100 extends Dispenser {

    public Dispenser100(Dispenser nextDispenser) {
        this.dispenser = nextDispenser;
    }

    @Override
    void dispense(Integer amount) {
        int noNotes = amount / 100;
        if(noNotes > 0){
            System.out.printf("%d notes dispensed of 100 \n", amount / 100);
        }
        int remAmt = amount % 100;
        if (remAmt > 0) {
            System.out.println("Not able to dispense amount " + remAmt);
        }
    }
}
