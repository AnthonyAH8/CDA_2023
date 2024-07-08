package com.example.exercice_spring_forum.service;

import com.example.exercice_spring_forum.entity.User;

import java.util.List;

public interface UserInterfaceService {
    List<User> getUsers();
    User getUser(int id);
    void createUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}
