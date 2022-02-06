package org.design.pattern.behavioral.chain.ex2;

/**
 * Date: 20/11/21
 * Time: 6:38 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Dispenser500 extends Dispenser{

    public Dispenser500(Dispenser nextDispenser) {
        this.dispenser = nextDispenser;
    }

    @Override
    void dispense(Integer amount) {
        int noNotes = amount / 500;
        if(noNotes > 0){
            System.out.printf("%d notes dispensed of 500 \n", amount / 500);
        }
        int remAmt = amount % 500;
        if (remAmt > 0) {
            this.dispenser.dispense(remAmt);
        }
    }
}
