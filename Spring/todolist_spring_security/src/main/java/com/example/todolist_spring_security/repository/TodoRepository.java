package com.example.todolist_spring_security.repository;

import com.example.todolist_spring_security.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
