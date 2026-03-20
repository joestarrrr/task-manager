package com.taskmanager.service;

import com.taskmanager.model.Task;
import com.taskmanager.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
class TaskServiceTest {

    @MockitoBean
    private TaskRepository taskRepository;

    @Autowired
    private TaskService taskService;

    @Test
    void shouldVerifyTaskIsSaved() {
        Task task = new Task("Drink water", "Enough water!", false);

        taskService.addTasks(task);

        verify(taskRepository, times(1)).save(any(Task.class));
    }
}