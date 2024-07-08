package com.example.exercice_spring_forum.service;

import com.example.exercice_spring_forum.dao.AuthenticationRepository;
import com.example.exercice_spring_forum.entity.Authentication;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    private AuthenticationRepository authenticationRepository;

    @Autowired
    private HttpSession session;

    public boolean authenticate(String username, String password) {
        if (authenticationRepository.findByUsername(username) != null) {
            return false;
        }
        Authentication authentication = new Authentication();
        authentication.setUsername(username);
        authentication.setPassword(password);
        authenticationRepository.save(authentication);
        return true;
    }

    public boolean login(String username, String password) {
        Authentication authentication = authenticationRepository.findByUsername(username);
        if (authentication != null && authentication.getPassword().equals(password)) {
            session.setAttribute("username", username);
            return true;
        }
        return false;
    }

    public boolean isLogged(){
        return session.getAttribute("username") != null;
    }

    public void logout() {
        session.invalidate();
    }
}
