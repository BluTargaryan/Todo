package com.todo.subtaskSystem.service;

import com.todo.subtaskSystem.model.Subtask;

import java.util.List;

public interface SubTaskService {

    public Subtask saveSubTask(Subtask subTask);

    public List<Subtask> getAllSubTasks();

    public void deleteSubTask(Long id);

    public Subtask updateSubTask(Long id, Subtask subTask);
}
