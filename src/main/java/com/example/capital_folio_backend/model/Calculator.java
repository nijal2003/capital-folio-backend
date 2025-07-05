package com.example.capital_folio_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "calculators")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calculator {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "slug")
    private String slug;

    @Column(name = "title")
    private String title;

    @Column(name = "description",columnDefinition = "TEXT")
    private String description;

    @Column(name = "category")
    private String category;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @OneToMany(mappedBy = "calculator", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CalculatorField> fields;

    @OneToMany(mappedBy = "calculator", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CalculationFormula> formulas;


}