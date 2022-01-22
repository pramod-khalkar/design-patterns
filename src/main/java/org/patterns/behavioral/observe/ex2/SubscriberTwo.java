package org.patterns.behavioral.observe.ex2;

/**
 * Date: 14/11/21
 * Time: 2:23 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class SubscriberTwo extends Subscriber {

    public SubscriberTwo(Channel channel) {
        this.channel = channel;
        this.channel.addSubscriber(this);
    }

    @Override
    void notifySubscriber(String msg) {
        System.out.println(msg);
    }
}