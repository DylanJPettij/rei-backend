package com.example.reibackend.api.controller;

import com.example.reibackend.api.model.AmortizationTable;
import com.example.reibackend.api.model.CashFlowYield;
import com.example.reibackend.api.model.Property;
import com.example.reibackend.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import com.example.reibackend.service.MortgageCalculationsService;


@CrossOrigin(origins = "http://localhost:5173") // Specify the allowed origin
@RestController
public class PropertyController {

    private PropertyService propertyService;

    @Autowired
    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping("/property")
    public Property getProperty(@RequestParam Integer id){
        Optional property = propertyService.getProperty(id);
        if(property.isPresent()){
            return (Property) property.get();
        }
        return null;
    }
    //Get mortgage Payment for a property
    @GetMapping("/property/mortgage")
    public double getPropertyMortgage(@RequestParam Integer id, int years){
        Optional property = propertyService.getProperty(id);
        if(property.isPresent()){
            Property prop = (Property) property.get();
            MortgageCalculationsService mortgageCalculationsService = new MortgageCalculationsService();

            //scaling up to keep the first two decimal places and calculating the payment
            double payment = Math.round(mortgageCalculationsService.MortgagePayment(prop.getPurchasePrice(),prop.getDownPayment(),prop.getInterestRate(), years)*100);

            //scaling back down before returning
            return payment/100;
        }


        return 0;
    }
    //Get Interest only mortgage payment for a property
    @GetMapping("/property/mortgage-io")
    public double getPropertyIOMortgage(@RequestParam Integer id, int years){
        Optional property = propertyService.getProperty(id);
        if(property.isPresent()){
            Property prop = (Property) property.get();
            MortgageCalculationsService mortgageCalculationsService = new MortgageCalculationsService();

            //scaling up to keep the first two decimal places and calculating the payment
            double payment = Math.round(mortgageCalculationsService.InterestOnly(prop.getPurchasePrice(),prop.getDownPayment(),prop.getInterestRate(), years)*100);

            //scaling back down before returning
            return payment/100;
        }


        return 0;
    }
    //Get amortization table
    @GetMapping("/property/amortization")
    public AmortizationTable getAmortizationTable(@RequestParam double purchasePrice,double downPayment,double annualRate,double years){

        AmortizationTable amortizationSchedule = new  AmortizationTable();

            MortgageCalculationsService mcs = new MortgageCalculationsService();

        amortizationSchedule = mcs.getAmortizationSchedule(purchasePrice,downPayment,annualRate,years);


        return amortizationSchedule;
    }
    //Get amortization table
    @GetMapping("/property/amortization-y1")
    public double getYearOneAmortization(@RequestParam double purchasePrice,double downPayment,double annualRate,double years){

        MortgageCalculationsService mcs = new MortgageCalculationsService();

        double yearOne = mcs.yearOnePrincipal(purchasePrice,downPayment,annualRate,years);

        return yearOne;
    }
    @PostMapping("/property/cashflow")
    public CashFlowYield createRenovationCalc(@RequestBody Property property){


        CashFlowYield  cashFlowSchedule = new  CashFlowYield();

        MortgageCalculationsService mcs = new MortgageCalculationsService();
        PropertyService ps = new PropertyService();



        double mortgagePayment = mcs.MortgagePayment(property.getPurchasePrice(),property.getDownPayment(), property.getInterestRate(), property.getLoanTerm());

        cashFlowSchedule = mcs.CashFlow(property.getPurchasePrice(),property.getDownPayment(),property.getInterestRate(),property.getLoanTerm(),
                    property.getRenovationCosts(), mortgagePayment,property.getMaintenanceFactor(),property.getVacancyFactor(),property.getManagementFactor(),
                    property.getTaxes(), property.getInsuranceCosts(), property.getClosingCosts(), property.getAdditionalExpensesAnnual(),
                    property.getTotalRents(), property.getAdditionalIncome(), property.getMonthlyUtilities());



        return cashFlowSchedule;
    }
}
