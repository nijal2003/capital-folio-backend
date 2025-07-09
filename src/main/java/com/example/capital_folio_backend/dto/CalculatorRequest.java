package com.example.capital_folio_backend.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculatorRequest {

    @NotBlank(message = "Type must not be blank")
    private String type;

    @NotNull(message = "Inputs must not be null")
    @Valid
    private LoanCalculatorRequest inputs;
}
