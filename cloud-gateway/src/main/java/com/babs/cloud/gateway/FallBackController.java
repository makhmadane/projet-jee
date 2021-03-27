package com.babs.cloud.gateway;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallBackController {

    @RequestMapping(value = "/inscriptionFallBack")
    public Mono<String> inscriptionServiceFallback(){
        return Mono.just("Inscription Service prend du temps à répondre.réessayer plus tard svp!");
    }

    @RequestMapping(value = "/documentFallBack")
    public Mono<String> paimentServiceFallback(){
        return Mono.just("Document Service prend du temps à répondre.réessayer plus tard svp!");
    }
}
