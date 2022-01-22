package org.patterns.behavioral.command.ex2;

/**
 * Date: 18/11/21
 * Time: 7:00 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class FanOffCommand implements Command {

    private final Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.stopRotate();
    }
}
