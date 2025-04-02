package com.tascaandreu.tascaandreu.domain.ports.in;

import com.tascaandreu.tascaandreu.domain.models.User;

public interface CreateUserUseCase
{
    User createUser(User task);
}
