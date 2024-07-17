package com.example.todolist_spring_security.controller;

import com.example.todolist_spring_security.dto.BaseResponseDto;
import com.example.todolist_spring_security.entity.Role;
import com.example.todolist_spring_security.entity.User;
import com.example.todolist_spring_security.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public BaseResponseDto register(@RequestBody User user) {
        if (userService.createUser(user)){
            return new BaseResponseDto(true, "User registered successfully");
        }else {
            return new BaseResponseDto(false, "User could not be registered!");
        }
    }

    @PostMapping("/login")
    public BaseResponseDto login(@RequestBody User user, Role role) {
        if (userService.checkUsername(user.getUsername())) {
            if (userService.verifyUser(user.getUsername(), user.getPassword())) {
                Map<String, Object> map = new HashMap<>();
                map.put("token", userService.generateToken(user.getUsername(), user.getPassword(), role.getRolesEnum()));
                return new BaseResponseDto("Success", map);
            } else {
                return new BaseResponseDto("Username or password is incorrect", false);
            }
        } else {
            return new BaseResponseDto("Username or password is incorrect", false);
        }
    }
}
