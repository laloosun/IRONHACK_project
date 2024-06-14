package dev.v5tracker;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CheckingAccount extends Account {
    private double overdraftLimit;
    @Id
    private Long id;

    // Getters and Setters

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
