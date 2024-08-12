package com.example.todolist_spring_security.controller;

import com.example.todolist_spring_security.dto.BaseResponseDto;
import com.example.todolist_spring_security.dto.UserLoginDto;
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
            return new BaseResponseDto("User registered successfully", true);
        }else {
            return new BaseResponseDto( "User could not be registered!",false);
        }
    }

    @PostMapping("/login")
    public BaseResponseDto login(@RequestBody UserLoginDto userLoginDto) {
        if (userService.checkUsername(userLoginDto.getEmail())){
            if (userService.verifyUser(userLoginDto.getEmail(), userLoginDto.getPassword())){
                Map<String,Object> map = new HashMap<>();
                map.put("token", userService.generateToken(userLoginDto.getEmail(), userLoginDto.getPassword()));
                return new BaseResponseDto("User registered successfully", true);
            }else {
                return new BaseResponseDto( "User could not be registered!",false);
            }
        } else {
            return new BaseResponseDto( "User could not be registered!",false);
        }
    }
}
