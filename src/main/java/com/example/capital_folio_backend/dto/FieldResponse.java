package com.example.capital_folio_backend.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class FieldResponse {

    private String key;

    private String label;

    private String type;

    private Boolean required;

}