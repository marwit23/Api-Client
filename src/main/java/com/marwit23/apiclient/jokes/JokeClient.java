package com.marwit23.apiclient.jokes;

import reactor.core.publisher.Mono;

public interface JokeClient {

    Mono<Joke> getAnyJoke();
}
