package org.patterns.behavioral.observe.ex1;

/**
 * Date: 14/11/21
 * Time: 1:52 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.printf("Binary string: %s \n", Integer.toBinaryString(subject.getState()));
    }
}
