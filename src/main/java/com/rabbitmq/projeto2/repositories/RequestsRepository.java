package com.rabbitmq.projeto2.repositories;

import com.rabbitmq.projeto2.model.ProductsModel;
import com.rabbitmq.projeto2.model.RequestsModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RequestsRepository extends JpaRepository<RequestsModel, UUID> {

}

