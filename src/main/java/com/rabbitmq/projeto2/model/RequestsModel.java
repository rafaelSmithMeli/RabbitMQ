package com.rabbitmq.projeto2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_pedidos")

public class RequestsModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="pedidos_id")
    private UUID requestId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "user_id")
    private UserModel user;

    private String criticidade;

    private LocalDateTime dataDoPedido= LocalDateTime.now();

    @Column(name="valor")
    private Double preco;

    @ManyToMany
    @JoinTable(
            name ="itens_pedidos",
            joinColumns = @JoinColumn(name = "id_pedidos"),
            inverseJoinColumns = @JoinColumn(name = "id_produtos")
    )
    private List<ProductsModel>produtos;


}
