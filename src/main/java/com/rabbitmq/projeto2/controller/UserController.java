package com.rabbitmq.projeto2.controller;

import com.rabbitmq.projeto2.dto.UserDto;
import com.rabbitmq.projeto2.model.EmailModel;
import com.rabbitmq.projeto2.model.UserModel;
import com.rabbitmq.projeto2.repositories.UserRepository;
import com.rabbitmq.projeto2.service.UserService;
import jakarta.validation.Valid;
import org.apache.catalina.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Optional<UserModel> get(@PathVariable UUID id) {
        return userService.getId(id);
    }

    @GetMapping("/listar")
    public List<UserModel> getAll() {
        return userService.getAll();
    }

    @PostMapping("/create")
    public ResponseEntity<UserModel> create(@RequestBody @Valid UserDto userDto) {
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userDto, userModel);
        userService.create(userModel);
        return new ResponseEntity<>(userModel, HttpStatus.CREATED);
    }


}

