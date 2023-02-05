package com.reactive.test.reactor.eventbus;

import static reactor.bus.selector.Selectors.$;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.bus.EventBus;
@SpringBootApplication
public class ReactorApplication implements CommandLineRunner {
	@Autowired
	private EventBus eventBus;

	@Autowired
	private NotificationConsumer notificationConsumer;

	public static void main(String[] args) {
		SpringApplication.run(ReactorApplication.class, args);
		System.out.println("done");
	}

	@Override
	public void run(String... args) throws Exception {
		eventBus.on($("notificationConsumer"), notificationConsumer);
	}
}
