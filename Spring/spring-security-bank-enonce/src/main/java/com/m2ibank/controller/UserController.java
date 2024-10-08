package com.m2ibank.controller;

import com.m2ibank.dto.BaseResponseDto;
import com.m2ibank.dto.UserLoginDto;
import com.m2ibank.model.User;
import com.m2ibank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public BaseResponseDto register(@RequestBody User user) {
        if (userService.createUser(user)){
            return new BaseResponseDto(true, "User registered successfully");
        }else {
            return new BaseResponseDto(false, "User could not be registered!");
        }
    }

    @PostMapping("/login")
    public BaseResponseDto login(@RequestBody UserLoginDto loginDto) {
        if (userService.checkUsername(loginDto.getEmail())) {
            if (userService.verifyUser(loginDto.getEmail(), loginDto.getPassword())) {
                Map <String, Object> data = new HashMap<>();
                data.put("token", userService.generateToken(loginDto.getEmail(), loginDto.getPassword()));
                return new BaseResponseDto("Success", data);
            }else {
                return new BaseResponseDto("Invalid email or password");
            }
        }
        else {
            return new BaseResponseDto("Invalid email or password");
        }
    }
}
