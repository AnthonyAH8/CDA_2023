package com.example.__spring_bases.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String sayHello(){
        System.out.println("Hello world");
        return "sayHello";
    }

    @RequestMapping("/liste")
    @ResponseBody
    public List<String> stringList(){
        return List.of("Toto", "Titi", "Tata", "Tutu", "Jean-Kévin");

    }

    @RequestMapping("/details")
    public String showDetails(){
         return "persons/details";
    }
}
