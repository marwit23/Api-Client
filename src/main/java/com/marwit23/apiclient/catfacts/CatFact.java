package com.marwit23.apiclient.catfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CatFact {

    @JsonProperty("type")
    private String type;
    @JsonProperty("text")
    private String text;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
