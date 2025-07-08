
package com.example.capital_folio_backend.service;

import com.example.capital_folio_backend.dto.SchemaResponse;
import com.example.capital_folio_backend.model.Calculator;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CalculatorService {

    List<Calculator> getAllCalculators();

    Optional<Calculator> getCalculatorById(UUID id);

    Calculator saveCalculator(Calculator calculator);

    void deleteCalculator(UUID id);

    SchemaResponse getSchema(String type);
}