package com.tascaandreu.tascaandreu.domain.ports.out;

import com.tascaandreu.tascaandreu.domain.models.User;

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
