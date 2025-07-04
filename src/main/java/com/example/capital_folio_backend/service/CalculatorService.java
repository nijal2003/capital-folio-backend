package com.example.capitalfoliobackend.service;

import com.example.capitalfoliobackend.model.Calculator;
import com.example.capitalfoliobackend.repository.CalculatorRepository;
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

    public Optional<Calculator> getCalculatorById(Long id) {
        return calculatorRepository.findById(id);
    }

    public Calculator saveCalculator(Calculator calculator) {
        return calculatorRepository.save(calculator);
    }

    public void deleteCalculator(Long id) {
        calculatorRepository.deleteById(id);
    }
}