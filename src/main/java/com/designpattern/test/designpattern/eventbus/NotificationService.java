package com.designpattern.test.designpattern.eventbus;

public interface NotificationService {
    void initiateNotification(NotificationData notificationData)
            throws InterruptedException;
}
