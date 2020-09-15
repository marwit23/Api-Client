package com.marwit23.apiclient.jokes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class JokeClientImpl implements JokeClient {

    private WebClient webClient;

    @Autowired
    public JokeClientImpl() {
        this.webClient = WebClient.builder()
                .baseUrl("https://sv443.net/jokeapi/v2/joke")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    @Override
    public Mono<Joke> getAnyJoke() {
        return webClient.get()
                .uri("/Any")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .flatMap(clientResponse -> clientResponse.bodyToMono(Joke.class));
    }
}
