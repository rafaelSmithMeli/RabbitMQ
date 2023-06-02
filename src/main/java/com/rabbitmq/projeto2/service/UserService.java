package com.rabbitmq.projeto2.service;

import com.rabbitmq.projeto2.model.UserModel;
import com.rabbitmq.projeto2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserModel create(UserModel userModel) {
        return userRepository.save(userModel);

    }

    public Optional<UserModel> getId(UUID id) {
        return userRepository.findById(id);
    }


    public List<UserModel> getAll() {
        userRepository.findAll();
        return userRepository.findAll();
    }


    public UserModel update(UUID id) {

        return null;
    }


    public void delete(Long id) {

    }
}
