package com.rabbitmq.projeto2.controller;
import com.rabbitmq.projeto2.dto.ProductsDto;
import com.rabbitmq.projeto2.dto.RequestsDto;
import com.rabbitmq.projeto2.model.ProductsModel;
import com.rabbitmq.projeto2.model.RequestsModel;
import com.rabbitmq.projeto2.service.RequestsService;
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
@RequestMapping("/requests")
public class RequestsController {
    @Autowired
    private RequestsService requestsService;

    @GetMapping("/{id}")
    public Optional<RequestsModel> get(@PathVariable UUID id) {
        return requestsService.getId(id);
    }

    @GetMapping("/listar")
    public List<RequestsModel> getAll() {
        return requestsService.getAll();
    }

    @PostMapping("/create")
    public ResponseEntity<RequestsModel> create(@RequestBody @Valid RequestsDto requestsDto) {
        RequestsModel requestsModel = new RequestsModel();
        BeanUtils.copyProperties(requestsDto, requestsModel);
        requestsService.create(requestsModel);
        return new ResponseEntity<>(requestsModel, HttpStatus.CREATED);
    }


}


