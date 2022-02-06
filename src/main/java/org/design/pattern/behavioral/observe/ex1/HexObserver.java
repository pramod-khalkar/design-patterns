package org.design.pattern.behavioral.observe.ex1;

/**
 * Date: 14/11/21
 * Time: 1:56 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.printf("Hex string: %s \n", Integer.toHexString(subject.getState()));
    }
}
