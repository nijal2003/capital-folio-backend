package com.example.capital_folio_backend.model;

public class LoanCalculatorRequest {
    private double principal;
    private double annualInterestRate;
    private int tenureYears;

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setTenureYears(int tenureYears) {
        this.tenureYears = tenureYears;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getTenureYears() {
        return tenureYears;
    }
}
