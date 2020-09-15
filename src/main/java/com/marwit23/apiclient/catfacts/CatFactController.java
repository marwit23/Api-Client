package com.marwit23.apiclient.catfacts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/catfacts")
public class CatFactController {

    private CatFactClient catFactClient;

    public CatFactController(CatFactClient catFactClient) {
        this.catFactClient = catFactClient;
    }

    @GetMapping("/random")
    public Mono<CatFact> getRandomCatFact(){
        return catFactClient.getRandomCatFact();
    }
}
