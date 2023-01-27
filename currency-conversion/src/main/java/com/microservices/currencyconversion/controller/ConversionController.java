package com.microservices.currencyconversion.controller;

import com.microservices.currencyconversion.beans.ConversionCurrency;
import com.microservices.currencyconversion.proxy.ExchangeCurrencyProxy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;

@RestController
public class ConversionController {

    private ExchangeCurrencyProxy exchangeCurrencyProxy;

    public ConversionController(ExchangeCurrencyProxy exchangeCurrencyProxy) {
        this.exchangeCurrencyProxy = exchangeCurrencyProxy;
    }

    @GetMapping("/conversion/from/{from}/to/{to}/amount/{amount}")
    public ConversionCurrency calculateConversion(@PathVariable String from, @PathVariable String to, @PathVariable Long amount){

        HashMap<String,String> variables = new HashMap<>();
        variables.put("from",from);
        variables.put("to",to);
        ResponseEntity<ConversionCurrency> responseEntity = new RestTemplate().getForEntity("http://localhost:8080/currency/from/{from}/to/{to}",ConversionCurrency.class,variables );
        ConversionCurrency conversionCurrency = responseEntity.getBody();


        return new ConversionCurrency(conversionCurrency.getId(),from,to,amount, conversionCurrency.getExchangeValue(), (amount * conversionCurrency.getExchangeValue()), conversionCurrency.getEnvironment());
    }


    @GetMapping("/conversion-feign/from/{from}/to/{to}/amount/{amount}")
    public ConversionCurrency calculateConversionFeign(@PathVariable String from, @PathVariable String to, @PathVariable Long amount){


        ConversionCurrency conversionCurrency = exchangeCurrencyProxy.getCurrencyAmount(from, to);


        return new ConversionCurrency(conversionCurrency.getId(),from,to,amount, conversionCurrency.getExchangeValue(), (amount * conversionCurrency.getExchangeValue()), conversionCurrency.getEnvironment());
    }

}
