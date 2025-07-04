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

    public Long getId() {
        return id;
    }

    public String getSlug() {
        return slug;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isActive() {
        return isActive;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public List<CalculatorField> getFields() {
        return fields;
    }

    public List<CalculationFormula> getFormulas() {
        return formulas;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setFields(List<CalculatorField> fields) {
        this.fields = fields;
    }

    public void setFormulas(List<CalculationFormula> formulas) {
        this.formulas = formulas;
    }
}