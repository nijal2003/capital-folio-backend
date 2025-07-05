package com.example.capital_folio_backend.repository;

import com.example.capital_folio_backend.model.Calculator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CalculatorRepository extends JpaRepository<Calculator, UUID> {
}
