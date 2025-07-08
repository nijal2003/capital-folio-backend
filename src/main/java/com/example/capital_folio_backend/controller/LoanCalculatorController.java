package com.example.capital_folio_backend.controller;


import com.example.capital_folio_backend.dto.LoanCalculatorRequest;
import com.example.capital_folio_backend.dto.LoanCalculatorResponse;
import com.example.capital_folio_backend.dto.SchemaResponse;
import com.example.capital_folio_backend.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class LoanCalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/run")
    public LoanCalculatorResponse calculateLoan(@RequestBody LoanCalculatorRequest request) {

        return new LoanCalculatorResponse();
      }

    @GetMapping("/schema/{type}")
    public ResponseEntity<SchemaResponse> getSchema(@PathVariable String type) {

        SchemaResponse schemaResponse=calculatorService.getSchema(type);

        return ResponseEntity.ok(schemaResponse);
    }

}
