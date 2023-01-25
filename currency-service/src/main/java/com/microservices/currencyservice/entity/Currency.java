package com.microservices.currencyservice.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "Currency")
@Data
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     Long currency_id;
    @Column(name = "from_currency")
     String from;
    @Column(name = "to_currency")
     String to;
    @Column(name = "exchangeValue")
     Long exchangeValue;
    @Column(name = "environment")
     String environment;


}
