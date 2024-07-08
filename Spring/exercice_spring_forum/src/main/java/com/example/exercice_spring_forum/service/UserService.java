package com.example.exercice_spring_forum.service;

import com.example.exercice_spring_forum.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserInterfaceService{
    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(int id) {

    }
}
