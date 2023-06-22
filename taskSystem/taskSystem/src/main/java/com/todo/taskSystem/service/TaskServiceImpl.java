package com.todo.taskSystem.service;

import com.todo.taskSystem.model.Task;
import com.todo.taskSystem.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task saveTask(Task task){return taskRepository.save(task);}

    @Override
    public List<Task> getAllTasks(){return taskRepository.findAll();}

    @Override
    public void deleteTask(Long id){taskRepository.deleteById(id);}

    @Override
    public Task updateTask(Long id, Task updatedTask){
        Optional<Task> optionalTask = taskRepository.findById(id);
        if(optionalTask.isPresent()){
           Task task  = optionalTask.get();
           task.setTitle(updatedTask.getTitle());
           task.setPriority(updatedTask.getPriority());
           task.setImageUrl(updatedTask.getImageUrl());
           task.setExpectedDateTime(updatedTask.getExpectedDateTime());
           task.setCompleted(updatedTask.getCompleted());

           return taskRepository.save(task);
        }
        return null;
    }
}
