package com.example.reibackend.api.model;

public class Property {
    private int id;
    private String propertyAddress;
    private float purchasePrice;
    private float downPayment;
    private float interestRate;
    private float taxes;
    private float insurance;
    private float additionalExpenses;
    private float closingCosts;
    private float maintenanceCosts;
    private float managementCosts;
    private float rent;
    private float renovationCosts;
    private float loanTerm;
    private float yearlyUtilities;
    private float vacancy;
    private float otherIncome;

    public Property(int id, String propertyAddress, float purchasePrice, float downPayment, float interestRate, float taxes, float insurance, float additionalExpenses, float closingCosts, float maintenanceCosts, float managementCosts, float renovationCosts, float loanTerm, float yearlyUtilities, float vacancy, float otherIncome, float rent) {
        this.id = id;
        this.propertyAddress = propertyAddress;
        this.purchasePrice = purchasePrice;
        this.downPayment = downPayment;
        this.interestRate = interestRate;
        this.taxes = taxes;
        this.insurance = insurance;
        this.additionalExpenses = additionalExpenses;
        this.closingCosts = closingCosts;
        this.maintenanceCosts = maintenanceCosts;
        this.managementCosts = managementCosts;
        this.renovationCosts = renovationCosts;
        this.loanTerm = loanTerm;
        this.yearlyUtilities = yearlyUtilities;
        this.vacancy = vacancy;
        this.otherIncome = otherIncome;
        this.rent = rent;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }
    public float getPurchasePrice() {
        return purchasePrice;
    }
    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    public float getDownPayment() {
        return downPayment;
    }
    public void setDownPayment(float downPayment) {
        this.downPayment = downPayment;
    }
    public float getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
    public float getTaxes() {
        return taxes;
    }
    public void setTaxes(float taxes) {
        this.taxes = taxes;
    }
    public float getInsurance() {
        return insurance;
    }
    public void setInsurance(float insurance) {
        this.insurance = insurance;
    }
    public float getAdditionalExpenses() {
        return additionalExpenses;
    }
    public void setAdditionalExpenses(float additionalExpenses) {
        this.additionalExpenses = additionalExpenses;
    }
    public float getClosingCosts() {
        return closingCosts;
    }
    public void setClosingCosts(float closingCosts) {
        this.closingCosts = closingCosts;
    }
    public float getMaintenanceCosts() {
        return maintenanceCosts;
    }
    public void setMaintenanceCosts(float maintenanceCosts) {
        this.maintenanceCosts = maintenanceCosts;
    }
    public float getManagementCosts() {
        return managementCosts;
    }
    public void setManagementCosts(float managementCosts) {
        this.managementCosts = managementCosts;
    }
    public float getRent() {
        return rent;
    }
    public void setRent(float rent) {
        this.rent = rent;
    }
    public float getRenovationCosts() {
        return renovationCosts;
    }
    public void setRenovationCosts(float renovationCosts) {
        this.renovationCosts = renovationCosts;
    }
    public float getLoanTerm() {
        return loanTerm;
    }
    public void setLoanTerm(float loanTerm) {
        this.loanTerm = loanTerm;
    }
    public float getYearlyUtilities() {
        return yearlyUtilities;
    }
    public void setYearlyUtilities(float yearlyUtilities) {
        this.yearlyUtilities = yearlyUtilities;
    }
    public float getVacancy() {
        return vacancy;
    }
    public void setVacancy(float vacancy) {
        this.vacancy = vacancy;
    }
    public float getOtherIncome() {
        return otherIncome;
    }
    public void setOtherIncome(float otherIncome) {
        this.otherIncome = otherIncome;
    }
}


