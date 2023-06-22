package com.todo.taskSystem.service;

import com.todo.taskSystem.model.Task;

import java.util.List;

public interface TaskService {

public Task saveTask(Task task);

public List<Task> getAllTasks();

public void deleteTask(Long id);

public Task updateTask(Long id, Task task);
}
