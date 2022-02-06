package org.design.pattern.behavioral.command.ex2;

/**
 * Date: 18/11/21
 * Time: 6:55 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class SwitchButton {
    private final Command upCommand, downCommand;

    public SwitchButton(Command upCommand, Command downCommand) {
        this.upCommand = upCommand;
        this.downCommand = downCommand;
    }

    public void flipDown() {
        this.downCommand.execute();
    }

    public void flipUp() {
        this.upCommand.execute();
    }
}
