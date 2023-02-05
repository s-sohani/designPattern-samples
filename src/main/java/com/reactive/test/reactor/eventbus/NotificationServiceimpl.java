package com.reactive.test.reactor.eventbus;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceimpl implements NotificationService {

    ArrayList<String> list = new ArrayList<>();
    @Override
    public void initiateNotification(NotificationData notificationData)
            throws InterruptedException {
//        System.out.println("Notification service started for "
//                + "Notification ID: " + notificationData.getId());
        if (notificationData.getId() % 2 == 0) {
            Thread.sleep(50);
        }
        list.add(String.valueOf(notificationData.getId()));

        System.out.println("Notification service ended for "
                + "Notification ID: " + notificationData.getId());

        for (var item : list) {
            System.out.println(item);
        }
    }
}
