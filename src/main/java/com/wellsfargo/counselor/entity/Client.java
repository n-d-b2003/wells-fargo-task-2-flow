package com.wellsfargo.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;

    @ManyToOne
    private Advisor advisor;

    @OneToOne(mappedBy = "client")
    private Portfolio portfolio;

    public Client() {}

    public Client(String firstName,
                  String lastName,
                  String email,
                  Advisor advisor,
                  Portfolio portfolio) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.advisor = advisor;
        this.portfolio = portfolio;
    }

    // getters and setters
}