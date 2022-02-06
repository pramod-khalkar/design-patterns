package org.design.pattern.behavioral.state.ex1;

/**
 * Date: 14/11/21
 * Time: 2:57 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "stop state";
    }
}
