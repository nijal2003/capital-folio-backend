package com.example.capitalfoliobackend.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "calculation_formulas")
public class CalculationFormula {
    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "calculator_id")
    private Calculator calculator;

    private String formulaType;

    @Column(columnDefinition = "TEXT")
    private String formula;

    private String outputKey;

}
