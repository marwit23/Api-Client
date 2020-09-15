package com.marwit23.apiclient.lyrics;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class SongClientImpl implements SongClient{

    private WebClient webClient;

    public SongClientImpl() {
        this.webClient = WebClient.builder()
                .baseUrl("https://api.lyrics.ovh/v1")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    @Override
    public Mono<Song> getSong(String artist, String title) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/{artist}/{title}")
                .build(artist, title))
                .exchange()
                .flatMap(clientResponse -> clientResponse.bodyToMono(Song.class));
    }
}
