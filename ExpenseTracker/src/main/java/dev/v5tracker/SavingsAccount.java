package dev.v5tracker;

import jakarta.persistence.Entity;

@Entity
public class SavingsAccount  extends Account{
    private double interestRate;

    // Getters and Setters

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
