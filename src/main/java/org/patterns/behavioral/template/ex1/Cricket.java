package org.patterns.behavioral.template.ex1;

/**
 * Date: 19/11/21
 * Time: 4:07 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Cricket extends Game {

    @Override
    protected void initialize() {
        System.out.println("Cricket initialized");
    }

    @Override
    protected void start() {
        System.out.println("cricket started");
    }

    @Override
    protected void end() {
        System.out.println("Cricket stopped");
    }
}
