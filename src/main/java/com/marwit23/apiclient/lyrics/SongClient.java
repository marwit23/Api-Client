package com.marwit23.apiclient.lyrics;

import reactor.core.publisher.Mono;

public interface SongClient {
    Mono<Song> getSong(String artist, String title);
}
