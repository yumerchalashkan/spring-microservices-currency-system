package com.microservices.currencyservice;

import com.microservices.currencyservice.entity.Currency;
import com.microservices.currencyservice.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class CurrencyServiceApplication implements CommandLineRunner {

	@Autowired
	private CurrencyRepository currencyRepository;

	public static void main(String[] args) {

		SpringApplication.run(CurrencyServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		Currency currency1 = new Currency();
		currency1.setFrom("USD");
		currency1.setTo("INR");
		currency1.setExchangeValue(65L);
		currency1.setEnvironment("");

		Currency currency2 = new Currency();
		currency2.setFrom("EUR");
		currency2.setTo("INR");
		currency2.setExchangeValue(75L);
		currency2.setEnvironment("");

		Currency currency3 = new Currency();
		currency3.setFrom("AUD");
		currency3.setTo("INR");
		currency3.setExchangeValue(85L);
		currency3.setEnvironment("");


		currencyRepository.save(currency1);
		currencyRepository.save(currency2);
		currencyRepository.save(currency3);
	}
}
