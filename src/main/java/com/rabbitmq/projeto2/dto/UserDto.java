package com.rabbitmq.projeto2.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDto {

    @NotBlank
    private String nome;

    @NotBlank
    @Email
    private String userEmail;
}

