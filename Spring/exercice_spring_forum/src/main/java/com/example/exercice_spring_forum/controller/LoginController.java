package com.example.exercice_spring_forum.controller;

import com.example.exercice_spring_forum.service.AuthenticationService;
import com.example.exercice_spring_forum.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginPost(@RequestParam String username, @RequestParam String password, Model model) {
        if (loginService.login(username, password)) {
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Mot de passe invalide");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(){
        loginService.logout();
        return "login";
    }
}
