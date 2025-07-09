package com.example.capital_folio_backend.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RetirementCalculatorResponse {

    @NotNull(message = "Estimated corpus must not be null")
    @Min(value = 1, message = "Estimated corpus must be greater than 0")
    private double estimatedCorpus;
}
