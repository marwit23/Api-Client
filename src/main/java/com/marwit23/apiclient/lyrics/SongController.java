package com.marwit23.apiclient.lyrics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/song")
public class SongController {

    private SongClient songClient;

    public SongController(SongClient songClient) {
        this.songClient = songClient;
    }

    @GetMapping("/{artist}/{title}")
    public Mono<Song> getSong(@PathVariable(name = "artist") String artist, @PathVariable(name = "title") String title) {
        return songClient.getSong(artist, title);
    }
}
