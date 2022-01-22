package org.patterns.behavioral.strategy.ex2;

/**
 * Date: 18/11/21
 * Time: 1:09 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia(new Facebook());
        socialMedia.connect("pramod");

        socialMedia = new SocialMedia(new Twitter());
        socialMedia.connect("pramod");
    }
}
