package com.designpattern.test.designpattern.eventbus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.bus.Event;
import reactor.bus.EventBus;

@Controller
public class NotificationController {

    @Autowired
    private EventBus eventBus;

    @GetMapping("/startNotification/{param}")
    public void startNotification(@PathVariable Integer param) throws InterruptedException {
        for (int i = 0; i < param; i++) {
            NotificationData data = new NotificationData();
            data.setId(i);

            eventBus.notify("notificationConsumer", Event.wrap(data));

            System.out.println(
                    "Notification " + i + ": notification task submitted successfully");
        }

    }

}
