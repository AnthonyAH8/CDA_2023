package com.example.spring_security_jwt.controller;

import com.example.spring_security_jwt.dto.BaseResponseDto;
import com.example.spring_security_jwt.dto.UserLoginDto;
import com.example.spring_security_jwt.entity.User;
import com.example.spring_security_jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public BaseResponseDto registerUser(@RequestBody User user) {

        if (userService.createUser(user)) {
            return new BaseResponseDto("User registered successfully");
        } else {
            return new BaseResponseDto("User already exists");
        }
    }

    @PostMapping("/login")
    public BaseResponseDto loginUser(@RequestBody UserLoginDto userLoginDto) {
        if (userService.checkUsernameExists(userLoginDto.getEmail())) {
            if (userService.verifyUser(userLoginDto.getEmail(), userLoginDto.getPassword())) {
                Map<String, Object> data = new HashMap<>();
                data.put("token", userService.generateToken(userLoginDto.getEmail(), userLoginDto.getPassword()));
                return new BaseResponseDto("success", data);
            } else {
                return new BaseResponseDto("Invalid email or password");
            }
        } else {
            return new BaseResponseDto("User does not exist");
        }
    }

}
