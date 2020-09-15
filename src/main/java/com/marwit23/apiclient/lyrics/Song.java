package com.marwit23.apiclient.lyrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Song {

    @JsonProperty("lyrics")
    private String lyrics;

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
}
