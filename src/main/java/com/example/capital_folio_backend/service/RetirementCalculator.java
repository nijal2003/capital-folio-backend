package com.example.capital_folio_backend.service;


public class RetirementCalculator {
    public static double calculateRetirementCorpus(double currentAge, double retirementAge, double monthlyExpense, double inflationRate) {
        int yearsLeft = (int)(retirementAge - currentAge);
        double futureExpense = monthlyExpense * Math.pow(1 + inflationRate / 100, yearsLeft);
        return futureExpense * 12 * 20; // 20 years of retirement assumed
    }
}
