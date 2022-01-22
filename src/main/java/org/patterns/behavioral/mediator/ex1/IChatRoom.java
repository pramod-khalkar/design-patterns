package org.patterns.behavioral.mediator.ex1;

/**
 * Date: 20/11/21
 * Time: 9:15 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public interface IChatRoom {
    void sendMsg(String msg, String userId);

    void addUser(User user);
}
