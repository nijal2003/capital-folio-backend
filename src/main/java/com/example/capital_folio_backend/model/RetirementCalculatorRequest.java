package com.example.capital_folio_backend.model;



public class RetirementCalculatorRequest {
    private int currentAge;
    private int retirementAge;
    private double monthlyExpense;
    private double inflationRate;

    public void setCurrentAge(int currentAge) {
        this.currentAge = currentAge;
    }

    public void setRetirementAge(int retirementAge) {
        this.retirementAge = retirementAge;
    }

    public void setMonthlyExpense(double monthlyExpense) {
        this.monthlyExpense = monthlyExpense;
    }

    public void setInflationRate(double inflationRate) {
        this.inflationRate = inflationRate;
    }

    public int getCurrentAge() {
        return currentAge;
    }

    public int getRetirementAge() {
        return retirementAge;
    }

    public double getMonthlyExpense() {
        return monthlyExpense;
    }

    public double getInflationRate() {
        return inflationRate;
    }
}
