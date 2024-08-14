package com.example.exercice_microservice_1.adapter.controller;

import com.example.exercice_microservice_1.domain.entity.User;
import com.example.exercice_microservice_1.domain.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@RequestParam int id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @PostMapping("/adduser")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

}
