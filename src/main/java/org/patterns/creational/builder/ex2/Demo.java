package org.patterns.creational.builder.ex2;

/**
 * Date: 03/11/21
 * Time: 6:38 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        UserReciver userReciver = new UserReciver();
        do {
            System.out.println(userReciver.getUser());
            sleep(1000);
        } while (true);
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
