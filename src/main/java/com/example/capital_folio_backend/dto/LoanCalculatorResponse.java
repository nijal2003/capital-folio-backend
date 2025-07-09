package com.example.capital_folio_backend.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanCalculatorResponse {

    @NotNull(message = "EMI must not be null")
    @Min(value = 1, message = "EMI must be greater than 0")
    private double emi;
}
