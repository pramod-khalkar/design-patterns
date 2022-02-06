package org.design.pattern.behavioral.observe.ex2;

/**
 * Date: 14/11/21
 * Time: 2:25 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Youtube {

    public static void main(String[] args) {
        Channel myChannel = new Channel("शेतकरी");
        Channel myChannel2 = new Channel("Techie");

        SubscriberOne subscriberOne = new SubscriberOne(myChannel);
        SubscriberTwo subscriberTwo = new SubscriberTwo(myChannel2);

        myChannel.upload("My new farm techniques to grow plant well");
        myChannel2.upload("New Macbook Pro M1 release");
    }
}
