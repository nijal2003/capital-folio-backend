package com.example.capital_folio_backend.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchemaResponse {

    @NotBlank(message = "Type must not be blank")
    private String type;

    @NotBlank(message = "Title must not be blank")
    private String title;

    @NotNull(message = "Fields must not be null")
    @NotEmpty(message = "Fields list must not be empty")
    @Valid
    private List<FieldResponse> fields;
}
