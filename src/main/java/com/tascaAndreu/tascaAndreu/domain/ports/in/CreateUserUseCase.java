package com.tascaAndreu.tascaAndreu.domain.ports.in;

import com.tascaAndreu.tascaAndreu.domain.models.User;

public interface CreateUserUseCase
{
    User createUser(User task);
}
