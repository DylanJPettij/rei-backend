package com.example.reibackend.api.controller;

import com.example.reibackend.api.model.Property;
import com.example.reibackend.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;
import com.example.reibackend.api.methods.Calculations;
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
    @GetMapping("/property/mortgage")
    public double getPropertyMortgage(@RequestParam Integer id, int years){
        Optional property = propertyService.getProperty(id);
        if(property.isPresent()){
            Property prop = (Property) property.get();
            Calculations calculations = new Calculations();
            double payment = calculations.MortgagePayment(prop.getPurchasePrice(),prop.getDownPayment(),prop.getInterestRate(), years);
            return payment;
        }


        return 0;
    }

}
