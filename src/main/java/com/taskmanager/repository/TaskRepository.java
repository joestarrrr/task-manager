package com.taskmanager.repository;

import com.taskmanager.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {
    private long currentId = 1;
    private final List<Task> tasks = new ArrayList<>();

    public TaskRepository() {
    }

    public List<Task> findAll() {
        return tasks;
    }

    public void save(Task task) {
        if (task.getId() == 0) {
            task.setId(currentId++);
        }
        tasks.add(task);
    }

    public void delete(long id) {
        tasks.removeIf(task -> task.getId() == id);
    }
}
