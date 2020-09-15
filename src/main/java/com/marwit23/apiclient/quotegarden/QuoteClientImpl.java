package com.marwit23.apiclient.quotegarden;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class QuoteClientImpl implements QuoteClient {

    private WebClient webClient;

    public QuoteClientImpl() {
        this.webClient = WebClient.builder()
                .baseUrl("https://quote-garden.herokuapp.com/api/v2")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    @Override
    public Mono<String> getRandomQuote() {
        return webClient.get()
                .uri("/quotes/random")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .flatMap(clientResponse -> clientResponse.bodyToMono(String.class));
    }
}
