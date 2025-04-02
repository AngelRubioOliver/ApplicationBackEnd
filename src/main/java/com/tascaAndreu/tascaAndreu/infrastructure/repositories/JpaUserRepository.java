package com.tascaandreu.tascaandreu.infrastructure.repositories;


import com.tascaandreu.tascaandreu.infrastructure.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUserRepository extends JpaRepository<UserEntity, Long> {
}
