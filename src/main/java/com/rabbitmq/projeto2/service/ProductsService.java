package com.rabbitmq.projeto2.service;

import com.rabbitmq.projeto2.model.ProductsModel;

import com.rabbitmq.projeto2.repositories.ProductsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository;

    public ProductsModel create(ProductsModel productsModel) {
        return productsRepository.save(productsModel);

    }

    public Optional<ProductsModel> getId(UUID id) {
        return productsRepository.findById(id);
    }


    public List<ProductsModel> getAll() {
        productsRepository.findAll();
        return productsRepository.findAll();
    }


    public ProductsModel update(UUID id) {

        return null;
    }


    public void delete(Long id) {

    }
}


