package com.rabbitmq.projeto2.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RequestsDto {
    @NotBlank
    private String criticidade;

    private Double preco;
}
