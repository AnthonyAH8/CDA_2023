package com.example.todolist_spring_security.controller;

import com.example.todolist_spring_security.dto.TodoDtoGet;
import com.example.todolist_spring_security.dto.TodoDtoPost;
import com.example.todolist_spring_security.service.todo.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("")
    public ResponseEntity<List<TodoDtoGet>> findAll() {
        return ResponseEntity.ok(todoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoDtoGet> findById(@PathVariable Long id) {
        return ResponseEntity.ok(todoService.getById(id));
    }

    @PostMapping("/add")
    public ResponseEntity<TodoDtoGet> create(@RequestBody TodoDtoPost todoDtoPost){
        return ResponseEntity.status(HttpStatus.CREATED).body(todoService.create(todoDtoPost));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<TodoDtoGet> update(@PathVariable Long id, @RequestBody TodoDtoPost todoDtoPost){
        return ResponseEntity.ok(todoService.update(id, todoDtoPost));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        return ResponseEntity.ok(todoService.delete(id));
    }
}
