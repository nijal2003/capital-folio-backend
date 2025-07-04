package com.example.capitalfoliobackend.model;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "calculator")
public class Calculator {
    @Id
    private Long id;

    private String slug;
    private String title;
    private String description;
    private String category;
    private boolean isActive;

    private Instant createdAt;
    private Instant updatedAt;

    @OneToMany(mappedBy = "calculator", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CalculatorField> fields;

    @OneToMany(mappedBy = "calculator", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CalculationFormula> formulas;

}
