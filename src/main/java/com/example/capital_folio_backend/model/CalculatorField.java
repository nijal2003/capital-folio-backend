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
@Table(name = "calculator_fields")
public class CalculatorField {
    @Id
    @Column(name = "id")
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "calculator_id")
    private Calculator calculator;

    @Column(name = "label")
    private String label;

    @Column(name = "key")
    private String key;

    @Column(name = "type")
    private String type;

    @Column(name = "required")
    private Boolean required;

    @Column(columnDefinition = "TEXT")
    private String defaultValue;

    @Column(columnDefinition = "JSON")
    private String options;

    @Column(columnDefinition = "JSON")
    private String validation;


   }