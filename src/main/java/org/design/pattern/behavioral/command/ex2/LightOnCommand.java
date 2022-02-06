package org.design.pattern.behavioral.command.ex2;

/**
 * Date: 18/11/21
 * Time: 6:56 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }
}
