package com.example.reibackend.api.model;

public class AmortizationTableEntry {
    private int id;
    private int month;
    private double principalPayment;
    private double interestPayment;
    private double loanAmount;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public double getPrincipalPayment() {
        return principalPayment;
    }
    public void setPrincipalPayment(double principalPayment) {
        this.principalPayment = principalPayment;
    }
    public double getInterestPayment() {
        return interestPayment;
    }
    public void setInterestPayment(double interestPayment) {
        this.interestPayment = interestPayment;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
}
