package com.microservices.currencyconversion.proxy;

import com.microservices.currencyconversion.beans.ConversionCurrency;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(name = "exchange-currency",url = "http://localhost:8080")
@FeignClient(name = "currency-service")
public interface ExchangeCurrencyProxy {
    @GetMapping("/currency/from/{from}/to/{to}")
    public ConversionCurrency getCurrencyAmount(@PathVariable String from, @PathVariable String to);
}
