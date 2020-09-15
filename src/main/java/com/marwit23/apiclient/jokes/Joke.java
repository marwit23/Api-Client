package com.marwit23.apiclient.jokes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Joke {

    @JsonProperty("joke")
    private String joke;

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

}
