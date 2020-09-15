package com.marwit23.apiclient.catfacts;

import reactor.core.publisher.Mono;

public interface CatFactClient {
    public Mono<CatFact> getRandomCatFact();
}
