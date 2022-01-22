package org.patterns.behavioral.command.ex2;

/**
 * Date: 18/11/21
 * Time: 6:59 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class FanOnCommand implements Command {

    private final Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.startRotate();
    }
}
