package com.example.capital_folio_backend.model;


public class RetirementCalculatorResponse {
    private double estimatedCorpus;

    public RetirementCalculatorResponse(double estimatedCorpus) {
        this.estimatedCorpus = estimatedCorpus;
    }

    public void setEstimatedCorpus(double estimatedCorpus) {
        this.estimatedCorpus = estimatedCorpus;
    }

    public double getEstimatedCorpus() {
        return estimatedCorpus;
    }
}
