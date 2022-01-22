package org.patterns.behavioral.chain.ex1;

/**
 * Date: 20/11/21
 * Time: 6:17 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        Chain chain = new Chain();

        chain.process(new RequestBody(10));
        chain.process(new RequestBody(-10));
        chain.process(new RequestBody(0));
    }
}
