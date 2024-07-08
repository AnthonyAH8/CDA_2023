package com.example.exercice_todolist.service;


import com.example.exercice_todolist.dto.TodoDtoPost;
import com.example.exercice_todolist.entity.Todo;
import com.example.exercice_todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    @Autowired
    private TodoRepository todoRepository;

    public Todo getToDoById(Long id) {
        return (Todo) todoRepository.findById(id).orElse(null);
    }

    public Todo saveTodo (TodoDtoPost todoDtoPost) {
        Todo todo = Todo.builder()
                .title(todoDtoPost.getTitle())
                .description(todoDtoPost.getDescription())
                .date(todoDtoPost.getDate())
                .build();
        return todoRepository.save(todo);
    }

    public Todo updateTodo(Long id, TodoDtoPost todoDtoPost) {
        Todo existingTodo = todoRepository.findById(id).orElse(null);
        if (existingTodo != null) {
            existingTodo.setTitle(todoDtoPost.getTitle());
            existingTodo.setDescription(todoDtoPost.getDescription());
            existingTodo.setDate(todoDtoPost.getDate());
            return todoRepository.save(existingTodo);
        } else {
            throw new RuntimeException();
        }
    }

    public ResponseEntity<String> deleteTodo(Long id) {
        todoRepository.deleteById(id);
        return null;
    }

    public List<Todo> getAllToDos() {
        return (List<Todo>) todoRepository.findAll();
    }

}
