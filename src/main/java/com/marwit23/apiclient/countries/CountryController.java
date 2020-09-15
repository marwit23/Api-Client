package com.marwit23.apiclient.countries;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("api/country")
public class CountryController {

    private CountryClient countryClient;

    public CountryController(CountryClient countryClient) {
        this.countryClient = countryClient;
    }

    @GetMapping("/all")
    public Flux<Country> getAllCountries() {
        return countryClient.getAllCountries();
    }
}
