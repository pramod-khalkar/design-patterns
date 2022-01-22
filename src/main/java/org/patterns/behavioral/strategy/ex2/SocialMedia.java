package org.patterns.behavioral.strategy.ex2;

/**
 * Date: 18/11/21
 * Time: 1:06 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class SocialMedia {
    private final Connector connector;

    public SocialMedia(Connector connector) {
        this.connector = connector;
    }

    public void connect(String name) {
        this.connector.connectTo(name);
    }
}
