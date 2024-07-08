package com.example.exercice_spring_forum.controller;

import com.example.exercice_spring_forum.entity.Authentication;
import com.example.exercice_spring_forum.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping
    public String authenticationForm(Model model) {
        model.addAttribute("authentication", new Authentication());
        return "authentication";
    }

    @PostMapping("/authentication")
    public String authentication(@RequestParam String username, @RequestParam String password, Model model) {
        if (authenticationService.authenticate(username, password)) {
            return "redirect:/login";
        } else {
            model.addAttribute("error", "Nom d'utilisateur dejà utilisé");
            model.addAttribute("authentication", new Authentication());
            return "authentication";
        }
    }
}
