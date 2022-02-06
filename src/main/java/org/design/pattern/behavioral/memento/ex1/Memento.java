package org.design.pattern.behavioral.memento.ex1;

/**
 * Date: 21/11/21
 * Time: 7:49 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
