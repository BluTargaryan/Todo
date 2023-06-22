package com.todo.subtaskSystem.repository;

import com.todo.subtaskSystem.model.Subtask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubTaskRepository extends JpaRepository<Subtask, Long> {
}
