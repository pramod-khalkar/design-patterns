package org.patterns.behavioral.observe.ex1;

/**
 * Date: 14/11/21
 * Time: 1:54 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.printf("Octal string: %s \n", Integer.toOctalString(subject.getState()));
    }
}
