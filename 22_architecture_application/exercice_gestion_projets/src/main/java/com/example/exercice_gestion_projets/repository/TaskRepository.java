package com.example.exercice_gestion_projets.repository;

import com.example.exercice_gestion_projets.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
