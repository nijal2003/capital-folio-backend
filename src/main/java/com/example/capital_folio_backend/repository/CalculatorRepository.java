package com.example.capitalfoliobackend.repository;

import com.example.capitalfoliobackend.model.Calculator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CalculatorRepository extends JpaRepository<Calculator, Long> {
}
