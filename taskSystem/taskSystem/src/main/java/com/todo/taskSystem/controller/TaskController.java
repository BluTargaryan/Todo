package com.todo.taskSystem.controller;


import com.todo.taskSystem.model.Task;
import com.todo.taskSystem.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
@CrossOrigin
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/add")
    public  String add(@RequestBody Task task){
        taskService.saveTask(task);
        return "New task is added";
    }

    @GetMapping("/getAll")
    public List<Task> list(){return taskService.getAllTasks();}

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
        return "Task with ID: " + id + " is deleted";
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task){return taskService.updateTask(id, task);}
}
