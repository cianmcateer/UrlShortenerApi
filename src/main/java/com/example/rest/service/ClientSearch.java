package com.example.rest.service;

public class ClientSearch {

    private final long id;
    private String search;
    private String[] keywords;

    public ClientSearch(long id, String search) {
        this.id = id;
        this.search = search.trim(); // Remove trailing whitespace on search
        this.keywords = search.split("\\s");
    }

    public long getId() {
        return id;
    }

    public String getSearch() {
        return search;
    }

    public String[] getKeywords() {
        return keywords;
    }



}
