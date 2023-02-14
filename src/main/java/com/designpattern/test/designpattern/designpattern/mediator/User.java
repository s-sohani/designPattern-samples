package com.designpattern.test.designpattern.designpattern.mediator;

public class User {
    private ChatMediator mediator;
    private String userName;

    public User(ChatMediator mediator, String userName) {
        this.mediator = mediator;
        this.userName = userName;
    }

    public void receiveMessage(String msg){
        System.out.println("message received for " + userName + " and msg is " + msg);
    }

    public void sendMessage(String msg) {
        System.out.println("message send from " + userName + " and msg is " + msg);
        mediator.sendMessage(msg, this);
    }

}
