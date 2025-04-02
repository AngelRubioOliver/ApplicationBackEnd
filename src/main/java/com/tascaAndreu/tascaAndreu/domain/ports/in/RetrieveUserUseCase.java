package com.tascaandreu.tascaandreu.domain.ports.in;

import com.tascaandreu.tascaandreu.domain.models.User;

import java.util.List;
import java.util.Optional;

public interface RetrieveUserUseCase
{
    Optional<User> retrieveUser(Long id);

    List<User> retrieveUsers();
}
