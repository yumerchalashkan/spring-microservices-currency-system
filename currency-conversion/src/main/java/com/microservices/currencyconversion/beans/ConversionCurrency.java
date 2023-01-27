package com.microservices.currencyconversion.beans;

import java.math.BigDecimal;

public class ConversionCurrency {
    private Long id;
    private String from;
    private String to;
    private Long amount;
    private Long exchangeValue;
    private Long total;
    private String environment;

    public ConversionCurrency(){

    }

    public ConversionCurrency(Long id, String from, String to, Long amount, Long exchangeValue, Long total, String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.exchangeValue = exchangeValue;
        this.total = total;
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

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getExchangeValue() {
        return exchangeValue;
    }

    public void setConversionMultiple(Long exchangeValue) {
        this.exchangeValue = exchangeValue;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
