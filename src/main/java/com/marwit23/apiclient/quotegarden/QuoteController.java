package com.marwit23.apiclient.quotegarden;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/quotegarden")
public class QuoteController {

    private QuoteClient quoteClient;

    @Autowired
    public QuoteController(QuoteClient quoteClient) {
        this.quoteClient = quoteClient;
    }

    @GetMapping("/random")
    public Mono<String> getRandomQuote(){
        return quoteClient.getRandomQuote();
    }
}
