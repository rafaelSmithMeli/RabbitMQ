package com.rabbitmq.projeto2.repositories;

import com.rabbitmq.projeto2.model.ProductsModel;
import com.rabbitmq.projeto2.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductsRepository extends JpaRepository<ProductsModel, UUID> {

}
