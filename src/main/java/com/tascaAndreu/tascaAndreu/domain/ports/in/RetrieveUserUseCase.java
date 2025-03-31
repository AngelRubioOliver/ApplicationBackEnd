package com.tascaAndreu.tascaAndreu.domain.ports.in;

import com.tascaAndreu.tascaAndreu.domain.models.User;

import java.util.List;
import java.util.Optional;

public interface RetrieveUserUseCase
{
    Optional<User> retrieveUser(Long id);

    List<User> retrieveUsers();
}
