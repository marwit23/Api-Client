package com.marwit23.apiclient.catfacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class CatFactClientImpl implements CatFactClient {

    private WebClient webClient;

    @Autowired
    public CatFactClientImpl() {
        this.webClient = WebClient.builder()
                .baseUrl("https://cat-fact.herokuapp.com")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    @Override
    public Mono<CatFact> getRandomCatFact() {
        return webClient.get()
                .uri("/facts/random")
                .exchange()
                .flatMap(clientResponse -> clientResponse.bodyToMono(CatFact.class));
    }
}
