package org.design.pattern.behavioral.mediator.ex1;

/**
 * Date: 20/11/21
 * Time: 9:18 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public abstract class User {
    private final String id;
    private final String name;
    private final IChatRoom chatRoom;

    public User(String id, String name, IChatRoom chatRoom) {
        this.id = id;
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public IChatRoom getChatRoom() {
        return chatRoom;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    abstract void sendMsg(String userId, String msg);

    abstract void receive(String msg);
}
