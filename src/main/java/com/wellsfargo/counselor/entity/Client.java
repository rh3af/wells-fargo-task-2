package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.*;

import com.wellsfargo.counselor.entity.Advisor;

import java.util.List;


@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clientId;

    @Column(nullable = false)
    private String clientName;

    @ManyToOne
    @JoinColumn(name = "advisorId")
    private Advisor advisor;

    @OneToOne
    @JoinColumn(name = "portfolioId")
    private Portfolio portfolio;


    @OneToMany(mappedBy = "client")
    private List<Securities> securities;



    protected Client(){


    }

    public Client(long portfolioId, String clientName, long advisorId){
        this.clientName = clientName;
        this.portfolio = portfolio;
        this.advisor = advisor;

    }

    public long getClientId() {
        return clientId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public Advisor getAdvisor(){
        return advisor;
    }


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
