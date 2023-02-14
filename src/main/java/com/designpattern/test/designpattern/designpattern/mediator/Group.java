package com.designpattern.test.designpattern.designpattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class Group implements ChatMediator{
    private List<User> userList = new ArrayList<>();
    @Override
    public void sendMessage(String msg, User user) {
        for (User u : userList) {
            if (u != user) {
                u.receiveMessage(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }
}
