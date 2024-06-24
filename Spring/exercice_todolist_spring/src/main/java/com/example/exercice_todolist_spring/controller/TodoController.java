package com.example.exercice_todolist_spring.controller;

public class TodoController {
    private String done;

    private String description;

    private boolean isDone;

    public TodoController(String done, String description, boolean isDone) {
        this.done = done;
        this.description = description;
        this.isDone = isDone;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
