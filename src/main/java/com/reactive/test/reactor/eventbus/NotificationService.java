package com.reactive.test.reactor.eventbus;

public interface NotificationService {
    void initiateNotification(NotificationData notificationData)
            throws InterruptedException;
}
