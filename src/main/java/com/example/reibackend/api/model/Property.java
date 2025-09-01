package com.example.reibackend.api.model;

public class Property {
    private int id;
    private String propertyAddress;
    private float purchasePrice;
    private float downPayment;
    private float interestRate;
    private float taxes;
    private float insuranceCosts;
    private float additionalExpensesAnnual;
    private float closingCosts;
    private float maintenanceFactor;
    private float managementFactor;
    private float totalRents;
    private float renovationCosts;
    private float loanTerm;
    private float monthlyUtilities;
    private float vacancyFactor;
    private float additionalIncome;
    private CashFlowYield cashFlowYield;

    public Property(int id, String propertyAddress, float purchasePrice, float downPayment, float interestRate, float taxes, float insuranceCosts, float additionalExpensesAnnual, float closingCosts, float maintenanceFactor, float managementFactor, float renovationCosts, float loanTerm, float monthlyUtilities, float vacancyFactor, float additionalIncome, float totalRents) {
        this.id = id;
        this.propertyAddress = propertyAddress;
        this.purchasePrice = purchasePrice;
        this.downPayment = downPayment;
        this.interestRate = interestRate;
        this.taxes = taxes;
        this.insuranceCosts = insuranceCosts;
        this.additionalExpensesAnnual = additionalExpensesAnnual;
        this.closingCosts = closingCosts;
        this.maintenanceFactor = maintenanceFactor;
        this.managementFactor = managementFactor;
        this.renovationCosts = renovationCosts;
        this.loanTerm = loanTerm;
        this.monthlyUtilities = monthlyUtilities;
        this.vacancyFactor = vacancyFactor;
        this.additionalIncome = additionalIncome;
        this.totalRents = totalRents;
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
    public float getInsuranceCosts() {
        return insuranceCosts;
    }
    public void setInsuranceCosts(float insuranceCosts) {
        this.insuranceCosts = insuranceCosts;
    }
    public float getAdditionalExpensesAnnual() {
        return additionalExpensesAnnual;
    }
    public void setAdditionalExpensesAnnual(float additionalExpensesAnnual) {
        this.additionalExpensesAnnual = additionalExpensesAnnual;
    }
    public float getClosingCosts() {
        return closingCosts;
    }
    public void setClosingCosts(float closingCosts) {
        this.closingCosts = closingCosts;
    }
    public float getMaintenanceFactor() {
        return maintenanceFactor;
    }
    public void setMaintenanceFactor(float maintenanceFactor) {
        this.maintenanceFactor = maintenanceFactor;
    }
    public float getManagementFactor() {
        return managementFactor;
    }
    public void setManagementFactor(float managementFactor) {
        this.managementFactor = managementFactor;
    }
    public float getTotalRents() {
        return totalRents;
    }
    public void setTotalRents(float totalRents) {
        this.totalRents = totalRents;
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
    public float getMonthlyUtilities() {
        return monthlyUtilities;
    }
    public void setMonthlyUtilities(float monthlyUtilities) {
        this.monthlyUtilities = monthlyUtilities;
    }
    public float getVacancyFactor() {
        return vacancyFactor;
    }
    public void setVacancyFactor(float vacancyFactor) {
        this.vacancyFactor = vacancyFactor;
    }
    public float getAdditionalIncome() {
        return additionalIncome;
    }
    public void setAdditionalIncome(float additionalIncome) {
        this.additionalIncome = additionalIncome;
    }
    public CashFlowYield getCashFlowYield() {
        return cashFlowYield;
    }
    public void setCashFlowYield(CashFlowYield cashFlowYield) {
        this.cashFlowYield = cashFlowYield;
    }
}


