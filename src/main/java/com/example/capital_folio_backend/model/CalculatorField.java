package com.example.capitalfoliobackend.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "calculator_fields")
public class CalculatorField {
    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "calculator_id")
    private Calculator calculator;

    private String label;
    private String key;
    private String type;
    private boolean required;

    @Column(columnDefinition = "TEXT")
    private String defaultValue;

    @Column(columnDefinition = "JSON")
    private String options;

    @Column(columnDefinition = "JSON")
    private String validation;

    public Long getId() {
        return id;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public String getLabel() {
        return label;
    }

    public String getKey() {
        return key;
    }

    public String getType() {
        return type;
    }

    public boolean isRequired() {
        return required;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public String getOptions() {
        return options;
    }

    public String getValidation() {
        return validation;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public void setValidation(String validation) {
        this.validation = validation;
    }
}