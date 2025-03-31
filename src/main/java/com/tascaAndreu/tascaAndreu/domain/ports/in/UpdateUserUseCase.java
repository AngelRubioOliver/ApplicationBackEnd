package com.tascaAndreu.tascaAndreu.domain.ports.in;


import com.tascaAndreu.tascaAndreu.domain.models.User;

import java.util.Optional;

public interface UpdateUserUseCase
{
    Optional<User> updateUser(Long id, User updateUser);
}
