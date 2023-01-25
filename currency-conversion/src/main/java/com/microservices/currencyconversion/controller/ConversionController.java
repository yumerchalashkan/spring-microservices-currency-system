package com.microservices.currencyconversion.controller;

import com.microservices.currencyconversion.beans.ConversionCurrency;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class ConversionController {

    @GetMapping("/conversion/from/{from}/to/{to}/amount/{amount}")
    public ConversionCurrency calculateConversion(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal amount){
        return new ConversionCurrency(100L,from,to,amount, BigDecimal.ONE,BigDecimal.TEN,"");
    }

}
