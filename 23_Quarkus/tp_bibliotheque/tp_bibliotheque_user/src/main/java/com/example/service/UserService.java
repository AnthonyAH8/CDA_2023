package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class UserService {

    @Inject
    UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.listAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Transactional
    public User addUser(User user) {
        userRepository.persist(user);
        return user;
    }

    @Transactional
    public User updateUser(Long id, User user) {
        User updatedUser = userRepository.findById(id);
        if (updatedUser != null) {
            updatedUser.setName(user.getName());
            updatedUser.setUsername(user.getUsername());
            updatedUser.setPassword(user.getPassword());
        }else{
            throw new EntityNotFoundException("User with id " + id + " not found");
        }
        return updatedUser;
    }

    @Transactional
    public User deleteUser(Long id) {
        User deleteUser = userRepository.findById(id);
        if (deleteUser != null) {
            userRepository.delete(deleteUser);
        }
        return deleteUser;
    }
}
