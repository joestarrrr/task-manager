package com.taskmanager.controller;

import com.taskmanager.model.Task;
import com.taskmanager.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class TaskController {
   private final TaskRepository repository;

    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return repository.findAll();
    }

    @PostMapping("/tasks")
    public Task addTasks(@RequestBody Task Task) {
        repository.save(Task);
        return Task;
    }

}
