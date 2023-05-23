package com.rabbitmq.projeto2.repositories;


import com.rabbitmq.projeto2.model.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
}
