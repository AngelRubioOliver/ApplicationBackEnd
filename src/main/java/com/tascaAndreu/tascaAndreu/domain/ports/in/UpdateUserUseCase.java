package com.tascaandreu.tascaandreu.domain.ports.in;


import com.tascaandreu.tascaandreu.domain.models.User;

import java.util.Optional;

public interface UpdateUserUseCase
{
    Optional<User> updateUser(Long id, User updateUser);
}
