package com.tascaandreu.tascaandreu.application.usecases;

import com.tascaandreu.tascaandreu.domain.models.User;
import com.tascaandreu.tascaandreu.domain.ports.in.CreateUserUseCase;
import com.tascaandreu.tascaandreu.domain.ports.out.UserRepositoryPort;

public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public CreateUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User createUser(User user) {
        return userRepositoryPort.save(user);
    }
}
