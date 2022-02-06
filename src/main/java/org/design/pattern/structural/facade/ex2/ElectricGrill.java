package org.design.pattern.structural.facade.ex2;

/**
 * Date: 13/11/21
 * Time: 4:38 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class ElectricGrill extends Appliance {

    protected int temp;

    public ElectricGrill() {
        super("Electric grill");
    }

    public void setTemp(int temp) {
        this.temp = temp;
        System.out.printf("%s setting temp to %d \n", this.name, this.temp);
    }

    public int getTemp() {
        return temp;
    }
}
