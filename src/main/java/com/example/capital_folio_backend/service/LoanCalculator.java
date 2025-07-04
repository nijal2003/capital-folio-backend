package com.example.capital_folio_backend.service;

public class LoanCalculator {
    public static double calculateEMI(double principal, double annualRate, int tenureYears) {
        double monthlyRate = annualRate / 12 / 100;
        int months = tenureYears * 12;
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                (Math.pow(1 + monthlyRate, months) - 1);
    }
}
