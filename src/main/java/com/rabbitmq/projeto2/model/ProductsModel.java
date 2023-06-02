package com.rabbitmq.projeto2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_PRODUTOS")
public class ProductsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID productid;

    private String name;

    private Double price;

    @ManyToMany(mappedBy = "produtos")
    private List<RequestsModel> requestsModels;
}
