package com.example.reibackend.service;

import com.example.reibackend.api.model.Property;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;


@Service
public class PropertyService {

    private ArrayList<Property> properties;

    public PropertyService(){

        properties = new ArrayList<>();

        Property property = new Property(
                1,                          // id
                "123 Main St", // propertyAddress
                250000.0f,                  // purchasePrice
                50000.0f,                   // downPayment
                6.25f,                      // interestRate (percent)
                3200.0f,                    // taxes (yearly)
                1200.0f,                    // insurance (yearly)
                150.0f,                     // additionalExpenses
                5000.0f,                    // closingCosts
                1800.0f,                    // maintenanceCosts
                2400.0f,                    // managementCosts
                2200.0f,                    // rent (monthly)
                15000.0f,                   // renovationCosts
                30.0f,                      // loanTerm (years)
                1800.0f,                    // yearlyUtilities
                5.0f,                       // vacancy (percent)
                600.0f                      // otherIncome
            );
        Property property2 = new Property(
                2,                          // id
                "456 Oak Ave",              // propertyAddress
                185000.0f,                  // purchasePrice
                37000.0f,                   // downPayment
                5.75f,                      // interestRate (percent)
                2800.0f,                    // taxes (yearly)
                950.0f,                     // insurance (yearly)
                100.0f,                     // additionalExpenses
                4200.0f,                    // closingCosts
                1600.0f,                    // maintenanceCosts
                2000.0f,                    // managementCosts
                1800.0f,                    // rent (monthly)
                8000.0f,                    // renovationCosts
                20.0f,                      // loanTerm (years)
                1500.0f,                    // yearlyUtilities
                6.0f,                       // vacancy (percent)
                300.0f                      // otherIncome
        );

        Property property3 = new Property(
                3,                          // id
                "789 Pine Rd",              // propertyAddress
                325000.0f,                  // purchasePrice
                65000.0f,                   // downPayment
                6.50f,                      // interestRate (percent)
                4100.0f,                    // taxes (yearly)
                1400.0f,                    // insurance (yearly)
                200.0f,                     // additionalExpenses
                6000.0f,                    // closingCosts
                2200.0f,                    // maintenanceCosts
                3000.0f,                    // managementCosts
                2600.0f,                    // rent (monthly)
                12000.0f,                   // renovationCosts
                25.0f,                      // loanTerm (years)
                2000.0f,                    // yearlyUtilities
                4.0f,                       // vacancy (percent)
                750.0f                      // otherIncome
        );

        Property property4 = new Property(
                4,                          // id
                "101 Maple Blvd",           // propertyAddress
                420000.0f,                  // purchasePrice
                84000.0f,                   // downPayment
                5.90f,                      // interestRate (percent)
                5000.0f,                    // taxes (yearly)
                1600.0f,                    // insurance (yearly)
                250.0f,                     // additionalExpenses
                7000.0f,                    // closingCosts
                3000.0f,                    // maintenanceCosts
                3500.0f,                    // managementCosts
                3200.0f,                    // rent (monthly)
                20000.0f,                   // renovationCosts
                30.0f,                      // loanTerm (years)
                2400.0f,                    // yearlyUtilities
                5.0f,                       // vacancy (percent)
                900.0f                      // otherIncome
        );

        properties.addAll(Arrays.asList(property, property2, property3, property4));
    }
    public Optional<Property> getProperty(@RequestParam Integer id){
        Optional optional = Optional.empty();
        for (Property property : properties){
            if(property.getId() == id){
                optional = Optional.of(property);
                return optional;
            }
        }
    return optional;
    }

}
