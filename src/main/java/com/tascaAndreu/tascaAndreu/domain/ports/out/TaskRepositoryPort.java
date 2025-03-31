package com.tascaAndreu.tascaAndreu.domain.ports.out;

import com.hexagonal.tasks.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepositoryPort
{
    Task save(Task task);

    Optional<Task> findById(Long id);

    List<Task> findAll();

    Optional<Task> updateTask(Task task);

    boolean deleteTask(Long id);
}
