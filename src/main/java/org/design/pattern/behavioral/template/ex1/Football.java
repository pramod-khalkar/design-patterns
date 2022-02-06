package org.design.pattern.behavioral.template.ex1;

/**
 * Date: 19/11/21
 * Time: 4:10 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Football extends Game {

    @Override
    protected void initialize() {
        System.out.println("Football initialized");
    }

    @Override
    protected void start() {
        System.out.println("started");
    }

    @Override
    protected void end() {
        System.out.println("stopped");
    }
}
