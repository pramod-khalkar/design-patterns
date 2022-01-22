package org.patterns.structural.facade.ex2;

/**
 * Date: 13/11/21
 * Time: 4:41 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Microwave extends Appliance {

    protected int temp;
    protected int time;
    protected boolean grillOn = false;

    public Microwave() {
        super("Microwave");
    }

    public void setGrillOn() {
        this.grillOn = true;
        System.out.printf("%s setting grill on \n", this.name);
    }

    public void setGrillOff() {
        this.grillOn = false;
        System.out.printf("%s setting grill off \n", this.name);
    }

    public void setOnPreHeat(int temp, int time) {
        this.temp = temp;
        this.time = time;
        System.out.printf("Setting %s on preheat , time:%d , temp: %d \n", this.name, time, temp);
    }

    public void bake(String pizzaName, int temp, int time) {
        this.temp = temp;
        this.time = time;
        System.out.printf("baking %s in %s , time:%d , temp:%d \n", pizzaName, this.name, time, temp);
    }

    public int getTemp() {
        return temp;
    }

    public int getTime() {
        return time;
    }
}
