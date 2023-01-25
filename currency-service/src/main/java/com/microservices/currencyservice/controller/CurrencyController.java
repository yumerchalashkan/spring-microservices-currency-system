package com.microservices.currencyservice.controller;

import com.microservices.currencyservice.beans.Bounds;
import com.microservices.currencyservice.beans.ExchangeCurrency;
import com.microservices.currencyservice.config.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyController {

    private Configuration configuration;
    private Environment environment;

    public CurrencyController(Configuration configuration, Environment environment) {

        this.configuration = configuration;
        this.environment = environment;
    }

    @GetMapping("/limits")
    public Bounds getAllBounds(){

        return new Bounds(configuration.getMinimum(),configuration.getMaximum());
    }

    @GetMapping("/currency/from/{from}/to/{to}")
    public ExchangeCurrency getCurrencyAmount(@PathVariable String from, @PathVariable String to){
        ExchangeCurrency exchangeCurrency = new ExchangeCurrency(10L,from,to, BigDecimal.valueOf(100));

        String port = environment.getProperty("local.server.port");

        exchangeCurrency.setEnvironment(port);
        return exchangeCurrency;
    }
}
