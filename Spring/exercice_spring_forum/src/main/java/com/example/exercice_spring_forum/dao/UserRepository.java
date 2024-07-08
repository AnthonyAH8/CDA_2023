package com.example.exercice_spring_forum.dao;

import com.example.exercice_spring_forum.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
