package com.wellsfargo.counselor.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;



@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioID;
    private Long clientID;
    

    public Portfolio() {
    }

    public Portfolio(Long clientID, String name, String description) {
        this.clientID = clientID;
        
    }

    public Long getPortfolioID() {
        return portfolioID;
    }

    public Long getClientID() {
        return clientID;
    }

    public void setClientID(Long clientID) {
        this.clientID = clientID;
    }

}
