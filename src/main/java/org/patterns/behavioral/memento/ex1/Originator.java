package org.patterns.behavioral.memento.ex1;

/**
 * Date: 21/11/21
 * Time: 7:50 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
        //System.out.printf("Originator: Setting state to %s \n", this.state);
    }

    public Memento save() {
        System.out.printf("Originator: Saving state to %s \n", this.state);
        return new Memento(this.state);
    }

    public void restore(Memento memento) {
        this.state = memento.getState();
        System.out.printf("Originator: restoring state to %s \n", this.state);
    }

    public String getState() {
        return state;
    }
}
