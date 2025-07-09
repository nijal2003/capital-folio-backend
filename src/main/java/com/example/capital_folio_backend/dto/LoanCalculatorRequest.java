package com.example.capital_folio_backend.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoanCalculatorRequest {

    @NotNull(message = "Principal must not be null")
    @Min(value = 1, message = "Principal must be greater than 0")
    private double principal;

    @NotNull(message = "Rate must not be null")
    @Min(value = 1, message = "Rate must be greater than 0")
    private double rate;

    @NotNull(message = "Years must not be null")
    @Min(value = 1, message = "Years must be greater than 0")
    private int years;
}

