package com.designpattern.test.designpattern.eventbus;

import static reactor.Environment.MPSC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.Environment;
import reactor.bus.EventBus;
import reactor.core.Dispatcher;
import reactor.core.dispatch.WorkQueueDispatcher;

@Configuration
public class Config {

    @Bean
    public Environment env() {
        return Environment.initializeIfEmpty().assignErrorJournal();
    }

    @Bean
    public EventBus createEventBus(Environment env) {
        return EventBus.create(env, Environment.THREAD_POOL);
    }

//    @Bean
//    Reactor createReactor(Environment env) {
//        Reactor r = Reactors.reactor().env(env).dispatcher(createDispatcher()).get();
//        return r;
//    }

    @Bean
    public Dispatcher createDispatcher() {
        return new WorkQueueDispatcher("multiThreadedQueueDispatcher", 200, 2048, null);
    }
}
