package org.design.pattern.behavioral.observe.ex2;

/**
 * Date: 14/11/21
 * Time: 2:09 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public abstract class Subscriber {
    protected Channel channel;

    abstract void notifySubscriber(String msg);
}
