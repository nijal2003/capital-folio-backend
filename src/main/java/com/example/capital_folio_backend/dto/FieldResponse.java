package com.example.capital_folio_backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FieldResponse {

    @NotBlank(message = "Key must not be blank")
    private String key;

    @NotBlank(message = "Label must not be blank")
    private String label;

    @NotBlank(message = "Type must not be blank")
    private String type;

    @NotNull(message = "Required field must not be null")
    private Boolean required;
}
