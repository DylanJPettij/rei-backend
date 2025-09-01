package com.example.reibackend.api.model;

public class Mortgage {
    double purchasePrice;
    double downPayment;
    double interestRate;

    public double getDownPayment() {
        return downPayment;
    }
    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public double getPurchasePrice() {
        return purchasePrice;
    }
    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
