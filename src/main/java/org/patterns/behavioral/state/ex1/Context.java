package org.patterns.behavioral.state.ex1;

/**
 * Date: 14/11/21
 * Time: 2:42 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Context {
    private State state;

    public Context() {
        this.state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }
}
