package com.microservices.currencyservice.service;

import com.microservices.currencyservice.beans.ExchangeCurrency;
import com.microservices.currencyservice.entity.Currency;
import com.microservices.currencyservice.repository.CurrencyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrencyService {

    private final CurrencyRepository currencyRepository;

    public ExchangeCurrency getCurrencyFromAndTo(String from, String to){
        Currency currency = currencyRepository.findByFromAndTo(from,to);
        if(currency == null){
            throw new RuntimeException("Not found currency");
        }
        ExchangeCurrency exchangeCurrency = new ExchangeCurrency(currency.getCurrency_id(), currency.getFrom(), currency.getTo(), currency.getExchangeValue(),currency.getEnvironment());

        return exchangeCurrency;

    }
}
