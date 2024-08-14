package com.example.exercice_microservice_1.domain.shared.port;

import com.example.exercice_microservice_1.domain.entity.User;

import java.util.List;

public interface UserPort {
    User save(User user);
    List<User> findAll();
}
