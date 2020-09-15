package com.marwit23.apiclient.countries;

import reactor.core.publisher.Flux;

public interface CountryClient {
    Flux<Country> getAllCountries();
}
