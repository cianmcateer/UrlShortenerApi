package com.example.rest.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SearchController {

    private static final String template = "";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/search")
    public ClientSearch search(@RequestParam(value = "search", defaultValue = "") String searchValue) {

        if (searchValue.equals("")) { // Deals with empty search
            return new ClientSearch(counter.incrementAndGet(), "No message entered");
        }

        ClientSearch clientSearch = new ClientSearch(counter.incrementAndGet(), searchValue);
        return clientSearch;
    }
}
