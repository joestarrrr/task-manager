package com.taskmanager.controller;

import com.taskmanager.model.Task;
import com.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service= service;
    }

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return service.getTasks();
    }

    @PostMapping("/tasks")
    public Task addTasks(@RequestBody Task task) {
        service.addTasks(task);
        return task;
    }

    @DeleteMapping("/tasks/{id}")
    public void deleteTask(@PathVariable long id) {
        service.deleteTask(id);
    }
}
