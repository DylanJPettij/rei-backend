package com.example.reibackend.service;
import com.example.reibackend.api.model.AmortizationTable;
import com.example.reibackend.api.model.AmortizationTableEntry;
import com.example.reibackend.api.model.CashFlowYield;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Optional;


@Service
public class MortgageCalculationsService {

    public double MortgagePayment(double purchasePrice, double downPayment, double interestRate, double years){

        // Convert annual rate percent to monthly decimal
        double monthlyRate = (interestRate / 100) / 12;

        double downPaymentDollars = purchasePrice*(downPayment/100);

        //get loan amount
        double loanAmount = purchasePrice - downPaymentDollars;

        // Total number of monthly payments
        double n = years * 12;

        // Amortization formula
        double monthlyPayment = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, n)) /
                (Math.pow(1 + monthlyRate, n) - 1);

        return monthlyPayment;
    }

    public double  InterestOnly(double purchasePrice, double downPayment, double interestRate, double years){
        double loanBalance =  purchasePrice - purchasePrice*(downPayment/100);
        double monthlyInterestRate = (interestRate / 12)/100;
        double monthlyPayment = (loanBalance * monthlyInterestRate);
        return monthlyPayment;
    }

    public CashFlowYield CashFlow (double purchasePrice, double downPayment, double interestRate, double years, double renovationExpenses, double mortgagePayment, double maintenanceFactor, double vacancyFactor, double managementFactor, double taxes, double insurance, double closingCosts, double additionalExpenses, double rent, double otherIncome, double utilityExpense){
        //create cashflow yield object that will be passed back
        CashFlowYield cashFlowYield = new CashFlowYield();


        //sum total entry & renovation expenses
        double downPaymentDollars = purchasePrice*(downPayment/100);
        double closingCostsDollars = (closingCosts/100) * (purchasePrice-downPaymentDollars);

        //total capital required on entry
        double entryCost = downPaymentDollars + renovationExpenses + closingCostsDollars;

        //Annual income
        double annualIncome = (rent + otherIncome)*12;



        //Maintenance, Vacancy, and Management
        double Vacancy = annualIncome*(vacancyFactor/100);

        double maintenanceExpense = (annualIncome - Vacancy)*(maintenanceFactor)/100;
        double managementExpense = (annualIncome - Vacancy)*(managementFactor)/100;

        double phantomCosts = managementExpense+maintenanceExpense;




        //Annual Expenses
        double annualCosts = 12*(utilityExpense) + insurance + taxes;

        double annualDebtService = Math.round(12*mortgagePayment*100);
        annualDebtService = annualDebtService/100;

        double netIncome = annualIncome - phantomCosts - annualCosts - Vacancy;

        double cashflow  = netIncome - annualDebtService - additionalExpenses;
        double cashflowYield = 10000*(cashflow/entryCost);


        cashflowYield = Math.round(cashflowYield);
        cashflowYield = cashflowYield/100;


        cashFlowYield.setCashOnCashYield(cashflowYield);
        cashFlowYield.setCashflowYield(cashflow);
        cashFlowYield.setDebtService(annualDebtService);
        cashFlowYield.setNetIncome(netIncome);
        cashFlowYield.setMaintenanceExpense(maintenanceExpense);
        cashFlowYield.setManagementExpense(managementExpense);


        return cashFlowYield;
    }

    public double yearOnePrincipal (double purchasePrice, double downPayment, double interestRate, double years){

        return 0;
    }

    //this function will return the amortization table
    public AmortizationTable getAmortizationSchedule(double purchasePrice,double downPayment,double annualRate,double years) {
        double downPaymentDollars = purchasePrice*(downPayment/100);

        AmortizationTable amortizationSchedule = new AmortizationTable();

        double monthlyPayment = MortgagePayment(purchasePrice, downPaymentDollars, annualRate, years);


        double loanAmount = purchasePrice - downPaymentDollars;
        double monthlyRate = (annualRate / 100) / 12;

        ArrayList<AmortizationTableEntry> amortizationTableEntries = new ArrayList<>();

        for (int month = 1; month <= years * 12; month++) {
            double interest = loanAmount * monthlyRate;
            double principalPaid = monthlyPayment - interest;
            loanAmount = loanAmount - principalPaid;

            //prevent overpayment
            if(loanAmount < 0) {
                loanAmount = 0;
            }

            //Setting information for Amortization table entry
            AmortizationTableEntry entry = new AmortizationTableEntry();
            entry.setMonth(month);
            entry.setInterestPayment(interest);
            entry.setPrincipalPayment(principalPaid);
            entry.setLoanAmount(loanAmount);
            System.out.println(entry.getPrincipalPayment());
            amortizationTableEntries.add(entry);
        }
            amortizationSchedule.setAmortizationSchedule(amortizationTableEntries);
            return amortizationSchedule;
    }


}
