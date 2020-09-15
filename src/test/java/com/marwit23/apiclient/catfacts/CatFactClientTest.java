package com.marwit23.apiclient.catfacts;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CatFactClientTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void testGetRandomCatFact(){
        webTestClient.get()
                .uri("https://cat-fact.herokuapp.com/facts/random")
                .exchange()
                .expectStatus().isOk()
                .expectBody(CatFact.class)
                .consumeWith(response ->
                        Assertions.assertThat(response.getResponseBody()).isNotNull());
    }

}
