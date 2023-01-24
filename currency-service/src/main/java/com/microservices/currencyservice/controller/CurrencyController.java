package com.microservices.currencyservice.controller;

import com.microservices.currencyservice.beans.Bounds;
import com.microservices.currencyservice.config.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    private Configuration configuration;

    public CurrencyController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public Bounds getAllBounds(){
        return new Bounds(configuration.getMinimum(),configuration.getMaximum());
    }
}
