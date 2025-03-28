package com.tascaAndreu.tascaAndreu.infrastructure.repositories;

import com.hexagonal.tasks.domain.models.Task;
import com.hexagonal.tasks.domain.ports.out.TaskRepositoryPort;
import com.hexagonal.tasks.infrastructure.entities.TaskEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JPATaskRepositoryAdapter implements TaskRepositoryPort {

    private final JPATaskRepository jpaTaskRepository;

    public JPATaskRepositoryAdapter(JPATaskRepository jpaTaskRepository) {
        this.jpaTaskRepository = jpaTaskRepository;
    }

    @Override
    public Task save(Task task) {
        TaskEntity taskEntity = TaskEntity.fromDomainModel(task);
        TaskEntity savedTaskEntity = jpaTaskRepository.save(taskEntity);
        return savedTaskEntity.toDomainModel();
    }

    @Override
    public Optional<Task> findById(Long id) {
        return jpaTaskRepository.findById(id).map(TaskEntity::toDomainModel);
    }

    @Override
    public List<Task> findAll() {
        return jpaTaskRepository.findAll().stream().map(TaskEntity::toDomainModel).collect(Collectors.toList());
    }

    @Override
    public Optional<Task> updateTask(Task task) {

        if(jpaTaskRepository.existsById(task.getId()))
        {
            TaskEntity taskEntity = TaskEntity.fromDomainModel(task);
            TaskEntity updateTaskEntity = jpaTaskRepository.save(taskEntity);
            return Optional.of(updateTaskEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteTask(Long id) {
       if(jpaTaskRepository.existsById(id))
       {
           jpaTaskRepository.deleteById(id);
           return true;
       }
        return false;
    }
}
