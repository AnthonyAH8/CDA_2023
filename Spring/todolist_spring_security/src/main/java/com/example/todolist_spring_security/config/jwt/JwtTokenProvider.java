package com.example.todolist_spring_security.config.jwt;

import com.example.todolist_spring_security.util.RolesEnum;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import org.springframework.security.core.GrantedAuthority;
import java.util.Base64;
import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class JwtTokenProvider {

    @Value("${jwt.secret}")
    private String secret;

    private SecretKey secretKey(){
        byte[] keybytes = Base64.getDecoder().decode(secret);
        return Keys.hmacShaKeyFor(keybytes);
    }

    public String generateToken(Authentication authentication, RolesEnum role){
        String username = authentication.getName();
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + 24 * 60 * 60 * 1000);

        Set<RolesEnum> roles = authentication.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .map(RolesEnum::valueOf)
                .collect(Collectors.toSet());

        String token = Jwts.builder()
                .setSubject(username)
                .claim(roles.toString(), role)
                .setIssuedAt(now)
                .setExpiration(expiryDate)
                .signWith(secretKey(), SignatureAlgorithm.HS512)
                .compact();
        return token;
    }

    public boolean validateToken(String token){
        try {
            Jwts.parserBuilder()
                    .setSigningKey(secretKey())
                    .build()
                    .parseClaimsJws(token);
            return true;
        }catch (Exception e){
            throw new AuthenticationCredentialsNotFoundException("JWT token not found or invalid");
        }
    }

    public String getUsername(String token){
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(secretKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
        return claims.getSubject();
    }
}
