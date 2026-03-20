package com.taskmanager.service;

import com.taskmanager.model.Task;
import com.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getTasks() {
        return repository.findAll();
    }

    public void addTasks(Task task) {
        repository.save(task);
    }

    public void deleteTask(long id) {
        repository.delete(id);
    }
}
