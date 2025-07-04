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
}
