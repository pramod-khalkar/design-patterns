package org.patterns.behavioral.observe.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 14/11/21
 * Time: 2:06 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Channel {

    private final List<Subscriber> subscriberList = new ArrayList<>();
    private final String channelName;

    public Channel(String channelName) {
        this.channelName = channelName;
    }

    public void upload(String videoTitle) {
        notifySubscribers(String.format("Please do watch new uploaded content \"%s\" from \"%s\"", videoTitle, this.channelName));
    }

    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    public void removeSubscriver(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    public void notifySubscribers(String msg) {
        subscriberList.forEach(sub -> {
            sub.notifySubscriber(msg);
        });
    }
}
