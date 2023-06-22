package com.todo.subtaskSystem.service;

import com.todo.subtaskSystem.model.Subtask;
import com.todo.subtaskSystem.repository.SubTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubTaskServiceImpl implements SubTaskService{

    @Autowired
    private SubTaskRepository subtaskRepository;

    @Override
    public Subtask saveSubTask(Subtask subtask){return subtaskRepository.save(subtask);}

    @Override
    public List<Subtask> getAllSubTasks(){return subtaskRepository.findAll();}

    @Override
    public void deleteSubTask(Long id){subtaskRepository.deleteById(id);}

    @Override
    public Subtask updateSubTask(Long id, Subtask updatedSubtask){
        Optional<Subtask> optionalSubTask = subtaskRepository.findById(id);
        if(optionalSubTask.isPresent()){
          Subtask subTask = optionalSubTask.get();

          subTask.setTitle(updatedSubtask.getTitle());
          subTask.setCompleted(updatedSubtask.isCompleted());

            return subtaskRepository.save(subTask);
        }
        return null;
    }
}
