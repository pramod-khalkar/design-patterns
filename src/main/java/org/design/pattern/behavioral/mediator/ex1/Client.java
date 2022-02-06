package org.design.pattern.behavioral.mediator.ex1;

/**
 * Date: 20/11/21
 * Time: 9:25 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {

    public static void main(String[] args) {
        IChatRoom chatRoom = new ChatRoom();

        User pramod = new CharUser("1", "PRAMOD", chatRoom);
        User sonu = new CharUser("2", "SONU", chatRoom);
        User krishna = new CharUser("3", "KRISHNA", chatRoom);

        chatRoom.addUser(pramod);
        chatRoom.addUser(sonu);
        chatRoom.addUser(krishna);

        pramod.sendMsg(krishna.getId(), "my first messag");
        sonu.sendMsg(pramod.getId(), "sending msg to third user");
    }
}
