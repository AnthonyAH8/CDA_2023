package com.example.exercice_todolist.controller;

import com.example.exercice_todolist.dto.TodoDtoPost;
import com.example.exercice_todolist.entity.Todo;
import com.example.exercice_todolist.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todolist")
public class TodoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping("/")
    public ResponseEntity<List<Todo>> findAll() {
        return ResponseEntity.ok((List<Todo>) toDoService.getAllToDos());
    }

    @PostMapping("/create")
    public ResponseEntity<TodoDtoPost> createTodo(@PathVariable("id") int id ) {
        Todo todo = toDoService.getToDoById((long) id);
        TodoDtoPost todoDtoPost = new TodoDtoPost( todo.getTitle(), todo.getDescription(), todo.getDate(), todo.isDone());
        return ResponseEntity.ok(todoDtoPost);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteTodo(@PathVariable("id") int id) {
        return toDoService.deleteTodo(Long.valueOf(id));
    }
}
