package com.example.capital_folio_backend.controller;

import com.example.capitalfoliobackend.model.LoanCalculatorRequest;
import com.example.capitalfoliobackend.model.LoanCalculatorResponse;
import com.example.capitalfoliobackend.service.LoanCalculator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class LoanCalculatorController {

    @PostMapping("/loan")
    public LoanCalculatorResponse calculateLoan(@RequestBody LoanCalculatorRequest request) {
        double emi = LoanCalculator.calculateEMI(request.getPrincipal(),
                request.getAnnualInterestRate(),
                request.getTenureYears());
        return new LoanCalculatorResponse(emi);
    }
}
