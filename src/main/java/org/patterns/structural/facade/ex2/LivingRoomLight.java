package org.patterns.structural.facade.ex2;

/**
 * Date: 13/11/21
 * Time: 5:01 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class LivingRoomLight extends Light {

    protected int brightness = 50;

    public LivingRoomLight() {
        super("LivingRoomLight");
    }

    public void dim() {
        brightness = 20;
        System.out.printf("Dimming %s \n", this.name);
    }

    public void bright() {
        brightness = 100;
        System.out.printf("Setting brightness to %d of %s \n", brightness, this.name);
    }
}
