package com.example.capital_folio_backend.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RetirementCalculatorRequest {

    @NotNull(message = "Current age must not be null")
    @Min(value = 18, message = "Current age must be at least 18")
    private int currentAge;

    @NotNull(message = "Retirement age must not be null")
    @Min(value = 30, message = "Retirement age must be at least 30")
    private int retirementAge;

    @NotNull(message = "Monthly expense must not be null")
    @Min(value = 1, message = "Monthly expense must be greater than 0")
    private double monthlyExpense;

    @NotNull(message = "Inflation rate must not be null")
    @Min(value = 1, message = "Inflation rate must be greater than 0")
    private double inflationRate;
}
