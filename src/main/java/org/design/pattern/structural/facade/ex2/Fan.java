package org.design.pattern.structural.facade.ex2;

/**
 * Date: 13/11/21
 * Time: 3:35 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public abstract class Fan extends Appliance {

    public static final int TOP_SPEED = 4;
    public static final int LOW_SPEED = 1;
    protected int currentSpeed = 1;

    public Fan(String name) {
        super(name);
    }

    public void increase() {
        if (currentSpeed < TOP_SPEED) {
            currentSpeed++;
            System.out.printf("Increasing %s speed to %d \n", this.name, currentSpeed);
        } else {
            System.out.printf("%s already running at top speed\n", this.name);
        }
    }

    public void decrease() {
        if (currentSpeed > LOW_SPEED) {
            currentSpeed--;
            System.out.printf("Decreasing %s speed to %d \n", this.name, currentSpeed);
        } else {
            System.out.printf("%s already running at lowest speed \n", this.name);
        }
    }
}
