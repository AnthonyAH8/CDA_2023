package com.example.__spring_bases.controller;

import com.example.__spring_bases.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SayHelloController {
    private GreetingsService greetingsService;

    @Autowired
    public SayHelloController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

}
