package org.patterns.behavioral.command.ex2;

/**
 * Date: 18/11/21
 * Time: 6:58 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }
}
