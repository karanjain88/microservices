package com.eazybytes.gatewayserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    // Since we are building RestApi inside the Gateway Server which is build on top of Spring Reactive,
    // we need to make sure we are wrapping the return type inside Mono.
    @RequestMapping("/contactSupport")
    public Mono<String> contactSupport() {
        return Mono.just("An error occurred. Please try after some time or contact support team!!");
    }
}
