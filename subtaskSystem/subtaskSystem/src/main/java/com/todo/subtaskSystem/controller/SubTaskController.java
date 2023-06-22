package com.todo.subtaskSystem.controller;


import com.todo.subtaskSystem.model.Subtask;
import com.todo.subtaskSystem.service.SubTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subtask")
@CrossOrigin
public class SubTaskController {

    @Autowired
    private SubTaskService subtaskService;

    @PostMapping("/add")
    public  String add(@RequestBody Subtask subTask){
        subtaskService.saveSubTask(subTask);
        return "New subtask is added";
    }

    @GetMapping("/getAll")
    public List<Subtask> list(){return subtaskService.getAllSubTasks();}

    @DeleteMapping("/{id}")
    public String deleteSubTask(@PathVariable Long id){
        subtaskService.deleteSubTask(id);
        return "Subtask with ID: " + id + " is deleted";
    }

    @PutMapping("/{id}")
    public Subtask updateSubTask(@PathVariable Long id, @RequestBody Subtask subTask){return subtaskService.updateSubTask(id, subTask);}
}
