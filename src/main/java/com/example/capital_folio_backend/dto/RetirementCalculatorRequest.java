package com.example.capital_folio_backend.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class RetirementCalculatorRequest {
    private int currentAge;
    private int retirementAge;
    private double monthlyExpense;
    private double inflationRate;

}
