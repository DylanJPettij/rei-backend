package com.example.reibackend.api.model;

import java.util.ArrayList;

public class AmortizationTable {

    private ArrayList<AmortizationTableEntry> amortizationSchedule;

    public ArrayList<AmortizationTableEntry> getAmortizationSchedule() {
        return amortizationSchedule;
    }

    public void setAmortizationSchedule(ArrayList<AmortizationTableEntry> amortizationSchedule) {
            this.amortizationSchedule = amortizationSchedule;
    }
}
