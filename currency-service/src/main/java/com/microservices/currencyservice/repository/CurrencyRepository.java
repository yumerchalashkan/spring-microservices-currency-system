package com.microservices.currencyservice.repository;

import com.microservices.currencyservice.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
    Currency findByFromAndTo(String from, String to);
}
