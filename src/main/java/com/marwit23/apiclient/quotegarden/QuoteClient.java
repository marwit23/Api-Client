package com.marwit23.apiclient.quotegarden;

import reactor.core.publisher.Mono;

// Mapping to Quote doesn't work. Nested JSON produces null values.
public interface QuoteClient {
    public Mono<String> getRandomQuote();
}
