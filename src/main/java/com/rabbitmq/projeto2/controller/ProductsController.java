package com.rabbitmq.projeto2.controller;

import com.rabbitmq.projeto2.dto.ProductsDto;
import com.rabbitmq.projeto2.dto.UserDto;
import com.rabbitmq.projeto2.model.ProductsModel;
import com.rabbitmq.projeto2.model.UserModel;
import com.rabbitmq.projeto2.service.ProductsService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
@RestController
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @GetMapping("/{id}")
    public Optional<ProductsModel> get(@PathVariable UUID id) {
        return productsService.getId(id);
    }

    @GetMapping("/listar")
    public List<ProductsModel> getAll() {
        return productsService.getAll();
    }

    @PostMapping("/create")
    public ResponseEntity<ProductsModel> create(@RequestBody @Valid ProductsDto productsDto) {
        ProductsModel productsModel = new ProductsModel();
        BeanUtils.copyProperties(productsDto, productsModel);
        productsService.create(productsModel);
        return new ResponseEntity<>(productsModel, HttpStatus.CREATED);
    }


}


