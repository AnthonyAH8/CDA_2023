package com.example.exercice_spring_forum.dao;

import com.example.exercice_spring_forum.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
