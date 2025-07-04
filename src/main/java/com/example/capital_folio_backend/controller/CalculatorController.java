package com.example.capital_folio_backend.controller;

import com.example.capital_folio_backend.model.Calculator;
import com.example.capital_folio_backend.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/calculators")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping
    public List<Calculator> getAllCalculators() {
        return calculatorService.getAllCalculators();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Calculator> getCalculatorById(@PathVariable UUID id) {
        return calculatorService.getCalculatorById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Calculator createCalculator(@RequestBody Calculator calculator) {
        return calculatorService.saveCalculator(calculator);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Calculator> updateCalculator(@PathVariable UUID id, @RequestBody Calculator calculatorDetails) {
        return calculatorService.getCalculatorById(id).map(calculator -> {
            calculator.setSlug(calculatorDetails.getSlug());
            calculator.setTitle(calculatorDetails.getTitle());
            calculator.setDescription(calculatorDetails.getDescription());
            calculator.setCategory(calculatorDetails.getCategory());
            calculator.setIsActive(calculatorDetails.getIsActive());
            calculator.setUpdatedAt(calculatorDetails.getUpdatedAt());
            return ResponseEntity.ok(calculatorService.saveCalculator(calculator));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCalculator(@PathVariable UUID id) {
        calculatorService.deleteCalculator(id);
        return ResponseEntity.noContent().build();
    }
}