package com.tascaAndreu.tascaAndreu.infrastructure.repositories;


import com.tascaAndreu.tascaAndreu.infrastructure.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUserRepository extends JpaRepository<UserEntity, Long> { // Obliga a extender JpaRepository<TaskEntity, Long> from Spring Data JPA{
}
