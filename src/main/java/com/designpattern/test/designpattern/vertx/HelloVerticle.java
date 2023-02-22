package com.designpattern.test.designpattern.vertx;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class HelloVerticle extends AbstractVerticle {
    @Override
    public void start(Future<Void> startFuture) throws Exception {
        vertx.createHttpServer()
                .requestHandler(r -> r.response().end("Welcome to Vert.x Intro"))
                .listen(config().getInteger("http.port", 9090),
                        result -> {
                            if (result.succeeded()) {
                                startFuture.complete();
                            } else {
                                startFuture.fail(result.cause());
                            }
                        });
    }
}
