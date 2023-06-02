package com.rabbitmq.projeto2.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
public class ProductsDto {
    @NotBlank
    private String name;

    private Double price;
}
