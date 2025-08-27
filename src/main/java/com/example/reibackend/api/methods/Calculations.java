package com.example.reibackend.api.methods;
import com.example.reibackend.api.model.AmortizationTable;
import com.example.reibackend.api.model.Property;
import java.lang.Math;
public class Calculations {

    public double MortgagePayment(double purchasePrice, double downPayment, double interestRate, double years){

        double loanBalance =  purchasePrice - downPayment;
        double monthlyInterestRate = (interestRate / 12)/100;
        double monthlyPayment = (loanBalance * monthlyInterestRate);
        //so far this only calculates interest only this needs to factor in principal payments as well

        return monthlyPayment;
    }

    public double  interestOnly(double purchasePrice, double downPayment, double interestRate, double years){
        double loanBalance =  purchasePrice - downPayment;
        double monthlyInterestRate = (interestRate / 12)/100;
        double monthlyPayment = (loanBalance * monthlyInterestRate);
        return monthlyPayment;
    }

    public double cashFlow (){

        return 0;
    }

    public double principalPaydown (){

        return 0;
    }
    public AmortizationTable amortizationCalc (){

        return null;
    }

}
