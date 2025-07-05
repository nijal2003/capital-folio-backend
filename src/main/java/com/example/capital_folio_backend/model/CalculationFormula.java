package com.example.capital_folio_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "calculation_formulas")
public class CalculationFormula {
    @Id
    @Column(name = "id")
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "calculator_id")
    private Calculator calculator;

    @Column(name = "formula_type")
    private String formulaType;

    @Column(name = "formula", columnDefinition = "TEXT")
    private String formula;

    @Column(name = "output_key")
    private String outputKey;

}