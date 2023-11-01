package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import com.wellsfargo.counselor.entity.Client;

import javax.sound.sampled.Port;

@Entity

public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioId;


    @OneToOne(mappedBy = "portfolio")

    private Client client;

    protected Portfolio(){

    }

    public Portfolio(long clientId){

    this.client=client;

    }

    public long getPortfolioId() {
        return portfolioId;
    }


    public Client getClient() {
        return client;
    }



}
