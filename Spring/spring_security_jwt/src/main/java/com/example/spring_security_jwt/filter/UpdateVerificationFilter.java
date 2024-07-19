package com.example.spring_security_jwt.filter;

import com.example.spring_security_jwt.config.jwt.JwtTokenProvider;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class UpdateVerificationFilter extends OncePerRequestFilter {

    @Autowired
    private JwtTokenProvider jwtTokenProvider;


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if ("UPDATE".equalsIgnoreCase(request.getMethod())) {
            String authHeader = request.getHeader("Authorization");

            if (authHeader != null && authHeader.startsWith("Bearer ")) {
                String jwtToken = authHeader.substring(7);
                try {
                    if (jwtTokenProvider.validateToken(jwtToken)) {
                        filterChain.doFilter(request, response);
                        return;
                    } else {
                        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid Token");
                        return;
                    }
                } catch (Exception e) {
                    response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid Token");
                    return;
                }
            } else {
                response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Missing or Invalid Authorization Header");
                return;
            }
        } else {
            filterChain.doFilter(request, response);
        }
    }
}
