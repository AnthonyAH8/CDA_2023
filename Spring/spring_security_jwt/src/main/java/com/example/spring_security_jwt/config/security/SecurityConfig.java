package com.example.spring_security_jwt.config.security;

import com.example.spring_security_jwt.config.jwt.JwtRequestFilter;
import com.example.spring_security_jwt.filter.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.Collections;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public JwtRequestFilter jwtRequestFilter() {
        return new JwtRequestFilter();
    }

    @Bean
    public EmailVerificationFilter emailVerificationFilter(){
        return new EmailVerificationFilter();
    }

    @Bean
    public LoginVerificationFilter loginVerificationFilter(){
        return new LoginVerificationFilter();
    }

    @Bean
    public RegisterVerificationFilter registerVerificationFilter(){
        return new RegisterVerificationFilter();
    }

    @Bean
    public PerformanceFilter performanceFilter(){
        return new PerformanceFilter();
    }

    @Bean
    public PostVerificationFilter postVerificationFilter(){
        return new PostVerificationFilter();
    }

    @Bean
    public UpdateVerificationFilter updateVerificationFilter(){
        return new UpdateVerificationFilter();
    }

    @Bean
    public DeleteVerificationFIlter deleteVerificationFIlter(){
        return new DeleteVerificationFIlter();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .cors(cors -> cors.configurationSource(corsConfiguration()))
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/api/auth/**").permitAll()
                        .requestMatchers("/api/products/list").hasAnyRole("USER", "ADMIN")
                        .requestMatchers("/api/products/create").hasRole("ADMIN")
                        .requestMatchers("*").authenticated()
                )
                .addFilterBefore(jwtRequestFilter(), UsernamePasswordAuthenticationFilter.class).addFilterBefore(emailVerificationFilter(), UsernamePasswordAuthenticationFilter.class)
                .addFilterBefore(loginVerificationFilter(), UsernamePasswordAuthenticationFilter.class)
                .addFilterBefore(registerVerificationFilter(), UsernamePasswordAuthenticationFilter.class)
                .addFilterBefore(new PerformanceFilter(), UsernamePasswordAuthenticationFilter.class)
                .addFilterBefore(postVerificationFilter(), UsernamePasswordAuthenticationFilter.class)
                .addFilterBefore(updateVerificationFilter(), UsernamePasswordAuthenticationFilter.class)
                .addFilterBefore(deleteVerificationFIlter(), UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }


    @Bean
    public UrlBasedCorsConfigurationSource corsConfiguration() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowedOriginPatterns(Arrays.asList("GET", "POST", "PUT", "DELETE"));
        corsConfiguration.setAllowedOriginPatterns(Collections.singletonList("http://localhost:3000"));
        corsConfiguration.setAllowedHeaders(Arrays.asList("*"));
        corsConfiguration.setAllowCredentials(true);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration);
        return source;
    }

    //    @Bean
//    public UserDetailsService inMemoryUserDetailsService() {
//        UserDetails user = User.withUsername("user")
//                .password(passwordEncoder().encode("password"))
//                .roles("USER")
//                .build();
//
//        UserDetails user2 = User.withUsername("admin")
//                .password(passwordEncoder().encode("admin"))
//                .roles("ADMIN")
//                .build();
//
//        return new InMemoryUserDetailsManager(user, user2);
//    }
}
