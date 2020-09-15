package com.marwit23.apiclient.quotegarden;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Quote {

    @JsonProperty
    private int statusCode;
    @JsonProperty("quoteText")
    private String quoteText;
    @JsonProperty("quoteAuthor")
    private String quoteAuthor;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    public void setQuoteAuthor(String quoteAuthor) {
        this.quoteAuthor = quoteAuthor;
    }
}
