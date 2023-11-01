package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;


import com.wellsfargo.counselor.entity.Portfolio;

@Entity
public class Securities {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long securityId;


    @ManyToOne
    @JoinColumn(name = "portfolioId")
    private Portfolio portfolio;

    @Column(nullable = false)
    private String securityName;

    @Column(nullable = false)
    private String securityCategory;

    @Column(nullable = false)
    private LocalDateTime purchaseDate;

    @Column(nullable = false)
    private long purchasePrice;

    @Column(nullable = false)
    private int purchaseQuantity;

    protected Securities(){

    }

    public Securities(Portfolio portfolio,String securityName, LocalDateTime purchaseDate, int purchaseQuantity, long purchasePrice){
        this.portfolio = portfolio;
        this.securityName = securityName;
        this.purchaseDate = purchaseDate;
        this.purchaseQuantity = purchaseQuantity;
        this.purchasePrice = purchasePrice;

    }

    public long getSecurityId() {
        return securityId;
    }



    public Portfolio getPortfolio() {
        return portfolio;
    }



    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public String getSecurityCategory() {
        return securityCategory;
    }

    public void setSecurityCategory(String securityCategory) {
        this.securityCategory = securityCategory;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(int purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }



}
