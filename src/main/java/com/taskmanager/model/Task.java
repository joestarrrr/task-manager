package com.taskmanager.model;

public class Task {
    private long id;
    private String name;
    private String description;
    private boolean completed;

    public Task() {}

    public Task(String name, boolean completed, String description, long id) {
        this.name = name;
        this.completed = completed;
        this.description = description;
        this.id = id;
    }

    public Task(String name, String description, boolean completed) {
        this.name = name;
        this.description = description;
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
