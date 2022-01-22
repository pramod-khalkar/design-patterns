package org.patterns.structural.facade.ex2;

/**
 * Date: 13/11/21
 * Time: 5:05 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class LivingRoomTV extends TV {

    protected String source;

    public LivingRoomTV() {
        super("LivingRoomTV");
    }

    public void setSource(String source) {
        this.source = source;
        System.out.printf("Setting source %s of %s \n", this.source, this.name);
    }

    public String getSource() {
        return source;
    }
}
