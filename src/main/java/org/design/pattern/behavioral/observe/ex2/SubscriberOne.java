package org.design.pattern.behavioral.observe.ex2;

/**
 * Date: 14/11/21
 * Time: 2:22 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class SubscriberOne extends Subscriber {

    public SubscriberOne(Channel channel) {
        this.channel = channel;
        this.channel.addSubscriber(this);
    }

    @Override
    void notifySubscriber(String msg) {
        System.out.println(msg);
    }
}
