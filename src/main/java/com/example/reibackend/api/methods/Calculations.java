package com.example.reibackend.api.methods;
import com.example.reibackend.api.model.Property;
import java.lang.Math;
public class Calculations {

    public double MortgagePayment(double purchasePrice, double downPayment, double interestRate, double years){

        double loanBalance =  purchasePrice - downPayment;
        double monthlyInterestRate = (interestRate / 12)/100;
        double monthlyPayment = (loanBalance * monthlyInterestRate);

        return monthlyPayment;
    }
}cd
