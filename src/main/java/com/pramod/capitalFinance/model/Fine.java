package com.pramod.capitalFinance.model;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "juarma")
public class Fine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fine_id;

    private BigDecimal fine_amount;
    private String fine_description;
    private Date fine_date;
    private boolean fine_paid;

    // Constructors, getters, and setters
    // Constructor without parameters (required by JPA)
    public Fine() {
    }

    // Getters and Setters
    public Long getFine_id() {
        return fine_id;
    }

    public void setFine_id(Long fine_id) {
        this.fine_id = fine_id;
    }

    public BigDecimal getFine_amount() {
        return fine_amount;
    }

    public void setFine_amount(BigDecimal fine_amount) {
        this.fine_amount = fine_amount;
    }

    public String getFine_description() {
        return fine_description;
    }

    public void setFine_description(String fine_description) {
        this.fine_description = fine_description;
    }

    public Date getFine_date() {
        return fine_date;
    }

    public void setFine_date(Date fine_date) {
        this.fine_date = fine_date;
    }

    public boolean isFine_paid() {
        return fine_paid;
    }

    public void setFine_paid(boolean fine_paid) {
        this.fine_paid = fine_paid;
    }
}
