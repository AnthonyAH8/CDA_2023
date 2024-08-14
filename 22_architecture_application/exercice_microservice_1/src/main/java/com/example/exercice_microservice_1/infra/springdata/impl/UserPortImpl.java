package com.example.exercice_microservice_1.infra.springdata.impl;

import com.example.exercice_microservice_1.domain.entity.User;
import com.example.exercice_microservice_1.domain.shared.port.UserPort;
import com.example.exercice_microservice_1.infra.springdata.entity.UserEntity;
import com.example.exercice_microservice_1.infra.springdata.repository.UserRepository;

import java.util.List;

public class UserPortImpl implements UserPort {
    private final UserRepository userRepository;
    public UserPortImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = UserEntity.builder().username(user.getUsername()).email(user.getEmail()).build();
        return new User();
    }

    @Override
    public List<User> findAll() {
        return (List<User>) ((List<User>) userRepository.findAll()).stream().map((user -> {
            new User(user.getId(), user.getUsername(), user.getEmail());
            return user;
        }));
    }
}
