package com.example.exercice_spring_forum.dao;

import com.example.exercice_spring_forum.entity.Authentication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationRepository extends JpaRepository<Authentication, Long> {
    Authentication findByUsername(String username);
}
