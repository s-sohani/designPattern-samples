package com.designpattern.test.designpattern.designpattern.mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator group = new Group();
        User user1 = new User(group, "user1");
        User user2 = new User(group, "user2");
        User user3 = new User(group, "user3");

        group.addUser(user1);
        group.addUser(user2);
        group.addUser(user3);

        user2.sendMessage("hi");
        user3.sendMessage("hi again");
    }
}
