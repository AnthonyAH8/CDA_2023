package com.example.exercice_gestion_projets.service;

import com.example.exercice_gestion_projets.annotation.UpdateAspectAnnotation;
import com.example.exercice_gestion_projets.entity.Task;
import com.example.exercice_gestion_projets.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @UpdateAspectAnnotation
    public List<com.example.exercice_gestion_projets.entity.Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public com.example.exercice_gestion_projets.entity.Task getTaskById(int id) {
        Optional<com.example.exercice_gestion_projets.entity.Task> task = taskRepository.findById((long) id);
         if (task.isPresent()) {
             return task.get();
         } else {
             throw new RuntimeException("Task not found");
         }
    }
    @UpdateAspectAnnotation
    public Task createTask(com.example.exercice_gestion_projets.entity.Task task) {
        return taskRepository.save(task);
    }
}
