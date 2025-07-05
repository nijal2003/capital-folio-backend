package com.example.capital_folio_backend.controller;


import com.example.capital_folio_backend.dto.RetirementCalculatorRequest;
import com.example.capital_folio_backend.dto.RetirementCalculatorResponse;
import com.example.capital_folio_backend.service.RetirementCalculator;
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
