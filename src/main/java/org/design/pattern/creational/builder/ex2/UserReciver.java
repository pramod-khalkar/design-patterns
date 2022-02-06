package org.design.pattern.creational.builder.ex2;

/**
 * Date: 04/11/21
 * Time: 7:04 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class UserReciver {

    private volatile User user;

    public UserReciver() {
        Thread t1 = newThread(() -> user = User.builder()
                .fname("Pramod")
                .age(20)
                .build());

        Thread t2 = newThread(() -> user = User.builder()
                .fname("khalkar")
                .age(10)
                .build());
        t1.start();
        t2.start();
    }

    public User getUser() {
        return user;
    }

    private Thread newThread(Runnable runnable) {
        return new Thread(runnable);
    }
}
