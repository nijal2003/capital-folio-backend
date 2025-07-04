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

    public Long getId() {
        return id;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public String getFormulaType() {
        return formulaType;
    }

    public String getFormula() {
        return formula;
    }

    public String getOutputKey() {
        return outputKey;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void setFormulaType(String formulaType) {
        this.formulaType = formulaType;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public void setOutputKey(String outputKey) {
        this.outputKey = outputKey;
    }
}