package com.designpattern.test.designpattern;

import com.designpattern.test.designpattern.eventbus.NotificationData;
import com.designpattern.test.designpattern.eventbus.ReactorApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.bus.Event;
import reactor.bus.EventBus;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ReactorApplication.class)
public class SpringContextTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }

    @Autowired
    private EventBus eventBus;

    @Test
    public void startNotification() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            NotificationData data = new NotificationData();
            data.setId(i);

            eventBus.notify("notificationConsumer", Event.wrap(data));

            System.out.println(
                    "Notification " + i + ": notification task submitted successfully");
        }

    }
}
