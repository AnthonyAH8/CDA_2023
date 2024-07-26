package com.example.todolist_spring_security.service.todo;

import com.example.todolist_spring_security.dto.TodoDtoGet;
import com.example.todolist_spring_security.dto.TodoDtoPost;
import com.example.todolist_spring_security.entity.Todo;
import com.example.todolist_spring_security.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {
    @Autowired
    private TodoRepository repository;

    public Todo findById(Long id) {
        return repository.findById(id).orElseThrow(null);
    }

    public TodoDtoGet getById(Long id) {
        return todoToTodoDtoGet(findById(id));
    }

    public List<TodoDtoGet> findAll() {
        return todoListToToDtoGetList((List<Todo>) repository.findAll());
    }

    public TodoDtoGet create(TodoDtoPost post) {
        Todo todo = Todo.builder()
                .title(post.getTitle())
                .description(post.getDescription())
                .isCompleted(post.isCompleted())
                .build();

        repository.save(todo);
        return todoToTodoDtoGet(todo);
    }

    public TodoDtoGet update(Long id, TodoDtoPost post) {
        Todo todo = findById(id);
        todo.setTitle(post.getTitle());
        todo.setDescription(post.getDescription());
        todo.setCompleted(post.isCompleted());
        repository.save(todo);
        return todoToTodoDtoGet(todo);
    }

    public boolean delete(Long id) {
        Todo todo = findById(id);
        repository.delete(todo);
        return true;
    }

    public TodoDtoGet changeStatus(Long id) {
        Todo todo = findById(id);
        todo.setCompleted(!todo.isCompleted());
        repository.save(todo);
        return todoToTodoDtoGet(todo);
    }

    private TodoDtoGet todoToTodoDtoGet (Todo todo){
        return TodoDtoGet.builder()
                .id(Math.toIntExact(todo.getId()))
                .title(todo.getTitle())
                .description(todo.getDescription())
                .isCompleted(todo.isCompleted())
                .build();
    }

    private List<TodoDtoGet> todoListToToDtoGetList(List<Todo> todoList){
        return todoList.stream().map(this::todoToTodoDtoGet).collect(Collectors.toList());
    }
}
