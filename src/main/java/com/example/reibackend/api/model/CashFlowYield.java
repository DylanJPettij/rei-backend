package com.example.reibackend.api.model;

public class CashFlowYield {
    private double cashOnCashYield;
    private double cashflowYield;
    private double debtService;
    private double netIncome;
    private double maintenanceExpense;
    private double managementExpense;
    private double VacancyExpense;
    private double capitalRequired;
    private double purchasePrice;
    private double downPayment;
    private double yearOnePrincipalPaydown;


    public  double getCashOnCashYield() {
        return cashOnCashYield;
    }
    public void setCashOnCashYield(double cashOnCashYield) {
        this.cashOnCashYield = cashOnCashYield;
    }
    public double getCashflowYield() {
        return cashflowYield;
    }
    public void setCashflowYield(double cashflowYield) {
        this.cashflowYield = cashflowYield;
    }
    public double getDebtService() {
        return debtService;
    }
    public void setDebtService(double debtService) {
        this.debtService = debtService;
    }
    public double getNetIncome() {
        return netIncome;
    }
    public void setNetIncome(double netIncome) {
        this.netIncome = netIncome;
    }
    public double getMaintenanceExpense() {
        return maintenanceExpense;
    }
    public void setMaintenanceExpense(double maintenanceExpense) {
        this.maintenanceExpense = maintenanceExpense;
    }
    public double getManagementExpense() {
        return managementExpense;
    }
    public void setManagementExpense(double managementExpense) {
        this.managementExpense = managementExpense;
    }
    public double getVacancyExpense() {
        return VacancyExpense;
    }
    public void setVacancyExpense(double vacancyExpense) {
        VacancyExpense = vacancyExpense;
    }
    public double getCapitalRequired() {
        return capitalRequired;
    }
    public void setCapitalRequired(double capitalRequired) {
        this.capitalRequired = capitalRequired;
    }
    public double getPurchasePrice() {
        return purchasePrice;
    }
    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    public double getDownPayment() {
        return downPayment;
    }
    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }
    public double getYearOnePrincipalPaydown() {
        return yearOnePrincipalPaydown;
    }
    public void setYearOnePrincipalPaydown(double yearOnePrincipalPaydown) {
        this.yearOnePrincipalPaydown = yearOnePrincipalPaydown;
    }
}
