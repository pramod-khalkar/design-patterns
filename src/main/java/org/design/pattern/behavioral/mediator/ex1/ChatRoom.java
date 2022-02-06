package org.design.pattern.behavioral.mediator.ex1;

import java.util.HashMap;
import java.util.Map;

/**
 * Date: 20/11/21
 * Time: 9:16 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class ChatRoom implements IChatRoom {

    private final Map<String, User> users = new HashMap<>();

    @Override
    public void sendMsg(String msg, String userId) {
        User user = this.users.get(userId);
        if (user == null) {
            throw new IllegalArgumentException("user doesnt exist");
        }
        user.receive(msg);
    }

    @Override
    public void addUser(User user) {
        this.users.put(user.getId(), user);
    }
}
