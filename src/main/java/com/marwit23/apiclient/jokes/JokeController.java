package com.marwit23.apiclient.jokes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/joke")
public class JokeController {

    private JokeClient jokeClient;

    public JokeController(JokeClient jokeClient) {
        this.jokeClient = jokeClient;
    }

    @GetMapping("/any")
    public Mono<Joke> getAnyJoke() {
        return jokeClient.getAnyJoke();
    }
}
