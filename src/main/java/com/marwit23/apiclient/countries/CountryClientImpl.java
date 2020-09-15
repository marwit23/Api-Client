package com.marwit23.apiclient.countries;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class CountryClientImpl implements CountryClient {

    private WebClient webClient;

    public CountryClientImpl() {
        this.webClient = WebClient.builder()
                .baseUrl("https://restcountries.eu/rest/v2")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    @Override
    public Flux<Country> getAllCountries() {
        return webClient.get()
                .uri("/all")
                .exchange()
                .flatMapMany(clientResponse -> clientResponse.bodyToFlux(Country.class));
    }
}
