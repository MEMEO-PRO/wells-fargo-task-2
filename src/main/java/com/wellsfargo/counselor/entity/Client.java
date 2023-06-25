package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;


@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientID;
    private Long advisorId;
    private String name;
    private String email;
    private String phone;

    public Client() {
    }

    public Client(Long advisorId, String name, String email, String phone) {
        this.advisorId = advisorId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Long getClientID() {
        return clientID;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorID(Long advisorId) {
        this.advisorId = advisorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}


