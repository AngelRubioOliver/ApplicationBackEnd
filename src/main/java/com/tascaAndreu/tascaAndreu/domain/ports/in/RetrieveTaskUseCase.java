package com.hexagonal.tasks.domain.ports.in;

import com.hexagonal.tasks.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase
{
    Optional<Task> retrieveTask(Long id);

    List<Task> retrieveTasks();
}
