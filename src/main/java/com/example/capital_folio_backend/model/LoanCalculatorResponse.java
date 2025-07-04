package com.example.capital_folio_backend.model;


public class LoanCalculatorResponse {
    private double emi;

    public LoanCalculatorResponse(double emi) {
        this.emi = emi;
    }

    public double getEmi() {
        return emi;
    }

    public void setEmi(double emi) {
        this.emi = emi;
    }
}
