package org.design.pattern.behavioral.state.ex1;

/**
 * Date: 14/11/21
 * Time: 2:55 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class StartState implements State {


    @Override
    public void doAction(Context context) {
        System.out.println("Player in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "start state";
    }
}
