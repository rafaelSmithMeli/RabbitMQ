package com.rabbitmq.projeto2.service;

import com.rabbitmq.projeto2.model.ProductsModel;
import com.rabbitmq.projeto2.model.RequestsModel;
import com.rabbitmq.projeto2.repositories.ProductsRepository;
import com.rabbitmq.projeto2.repositories.RequestsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RequestsService {
    @Autowired
    private RequestsRepository requestsRepository;

    public RequestsModel create(RequestsModel requestsModel) {
        return requestsRepository.save(requestsModel);

    }

    public Optional<RequestsModel> getId(UUID id) {
        return requestsRepository.findById(id);
    }


    public List<RequestsModel> getAll() {
        requestsRepository.findAll();
        return requestsRepository.findAll();
    }


    public RequestsModel update(UUID id) {

        return null;
    }


    public void delete(Long id) {

    }
}

