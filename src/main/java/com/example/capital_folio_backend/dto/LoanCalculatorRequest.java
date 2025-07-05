package com.example.capital_folio_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@NoArgsConstructor
@AllArgsConstructor
public class LoanCalculatorRequest {
    private double principal;
    private double annualInterestRate;
    private int tenureYears;

}
