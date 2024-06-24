package com.example.exercice_todolist_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TodoListController {

    @RequestMapping("/")
    public String todoList() {
        return "todoList";
    }

    @RequestMapping("/todo")
    @ResponseBody
    public List<Map<String, Object>> getAllTodos(){
        Map<String, Object> todo = new HashMap<>();
        todo.put("name", "coder");
        todo.put("description", "Coder toute la journée");
        todo.put("isDone", true);

        return Arrays.asList(todo);
    }

    @RequestMapping("/todo/coder")
    public String coder(Model model){
        model.addAttribute("name", "coder");
        model.addAttribute("description", "Coder toute la journée");
        model.addAttribute("isDone", true);
        return "todoCoder";
    }
}
