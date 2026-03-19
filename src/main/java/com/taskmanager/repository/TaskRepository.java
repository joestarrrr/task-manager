package com.taskmanager.repository;

import com.taskmanager.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {

    private final List<Task> tasks = new ArrayList<>();

    public TaskRepository() {
        tasks.add(new Task("Study Spring", true, "Prepare for lecture", 1));
        tasks.add(new Task("Gym", false, "Pre workout", 2));
        tasks.add(new Task("Weekend assignment", false, "plz no", 3));
    }

    public List<Task> findAll() {
        return tasks;
    }

    public void save(Task task) {
        tasks.add(task);
    }

    public void delete(long id) {
        tasks.removeIf(task -> task.getId() == id);
    }
}
