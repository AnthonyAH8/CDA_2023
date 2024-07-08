package com.example.exercice_spring_forum.service;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private String username;
    private String password;

    @Autowired
    private HttpSession session;

    public boolean login(String username, String password) {
        if (username.equals(username) && password.equals(password)) {
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            return true;
        }
        return false;
    }

    public boolean isLogged(){
        try {
            String sessionUsername = (String) session.getAttribute("username");
            String sessionPassword = (String) session.getAttribute("password");
            return sessionUsername != null && sessionPassword != null;
        } catch (Exception e) {
            return false;
        }
    }

    public void logout() {
        session.removeAttribute(username);
        session.removeAttribute(password);
    }
}
