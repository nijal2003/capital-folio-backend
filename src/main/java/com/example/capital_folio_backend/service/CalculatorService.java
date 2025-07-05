package com.example.capital_folio_backend.service;

import com.example.capital_folio_backend.model.Calculator;
import com.example.capital_folio_backend.repository.CalculatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class CalculatorService {
    @Autowired
    private CalculatorRepository calculatorRepository;

    public List<Calculator> getAllCalculators() {
        return calculatorRepository.findAll();
    }

    public Optional<Calculator> getCalculatorById(UUID id) {
        return calculatorRepository.findById(id);
    }

    public Calculator saveCalculator(Calculator calculator) {
        return calculatorRepository.save(calculator);
    }

    public void deleteCalculator(UUID id) {
        calculatorRepository.deleteById(id);
    }
}