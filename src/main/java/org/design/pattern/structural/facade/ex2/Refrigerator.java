package org.design.pattern.structural.facade.ex2;

/**
 * Date: 13/11/21
 * Time: 4:48 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Refrigerator extends Appliance {

    private static final String PARTY = "party";
    private static final String NORMAL = "normal";
    protected String mode = NORMAL;

    public Refrigerator() {
        super("Refregirator");
    }

    public void partyMode() {
        this.mode = PARTY;
        System.out.printf("setting %s on party mode \n", this.name);
    }

    public void normalMode() {
        this.mode = NORMAL;
        System.out.printf("Setting %s on normal mode\n", this.name);
    }
}
