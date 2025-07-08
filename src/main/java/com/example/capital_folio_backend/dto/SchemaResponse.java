package com.example.capital_folio_backend.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@Validated
@NoArgsConstructor
@AllArgsConstructor
public class SchemaResponse {

    private String type;

    private String title;

    private List<FieldResponse> fields;
}