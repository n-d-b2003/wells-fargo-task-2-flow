package com.wellsfargo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String portfolioName;

    @OneToOne
    private Client client;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    public Portfolio() {}

    public Portfolio(String portfolioName,
                     Client client,
                     List<Security> securities) {

        this.portfolioName = portfolioName;
        this.client = client;
        this.securities = securities;
    }

    // getters and setters
}