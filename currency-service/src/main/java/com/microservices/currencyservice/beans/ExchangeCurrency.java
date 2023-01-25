package com.microservices.currencyservice.beans;

import java.math.BigDecimal;

public class ExchangeCurrency {
    private Long id;
    private String from;
    private String to;
    private Long exchangeValue;

    private String environment;

    public ExchangeCurrency(){

    }

    public ExchangeCurrency(Long id, String from, String to, Long exchangeValue, String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.exchangeValue = exchangeValue;
        this.environment = environment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Long getExchangeValue() {
        return exchangeValue;
    }

    public void setExchangeValue(Long exchangeValue) {
        this.exchangeValue = exchangeValue;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
