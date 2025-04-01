package com.tascaAndreu.tascaAndreu.domain.ports.out;

import com.tascaAndreu.tascaAndreu.domain.models.User;

import java.util.List;
import java.util.Optional;

public interface UserRepositoryPort
{
    User save(User user);

    Optional<User> findById(Long id);

    List<User> findAll();

    Optional<User> updateUser(User user);

    boolean deleteUser(Long id);
}
