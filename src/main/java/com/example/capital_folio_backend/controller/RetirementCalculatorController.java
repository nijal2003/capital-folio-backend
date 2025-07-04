package com.example.capital_folio_backend.controller;


import com.example.capitalfoliobackend.model.RetirementCalculatorRequest;
import com.example.capitalfoliobackend.model.RetirementCalculatorResponse;
import com.example.capitalfoliobackend.service.RetirementCalculator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class RetirementCalculatorController {

    @PostMapping("/retirement")
    public RetirementCalculatorResponse calculateRetirement(@RequestBody RetirementCalculatorRequest request) {
        double corpus = RetirementCalculator.calculateRetirementCorpus(
                request.getCurrentAge(),
                request.getRetirementAge(),
                request.getMonthlyExpense(),
                request.getInflationRate()
        );
        return new RetirementCalculatorResponse(corpus);
    }
}
