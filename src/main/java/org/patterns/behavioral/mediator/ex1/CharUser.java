package org.patterns.behavioral.mediator.ex1;

/**
 * Date: 20/11/21
 * Time: 9:22 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class CharUser extends User {

    public CharUser(String id, String name, IChatRoom chatRoom) {
        super(id, name, chatRoom);
    }

    @Override
    void sendMsg(String userId, String msg) {
        System.out.println(this.getName() + " sending msg" + msg);
        getChatRoom().sendMsg(msg, userId);
    }

    @Override
    void receive(String msg) {
        System.out.println(msg + " msg received from " + this.getName());
    }
}
