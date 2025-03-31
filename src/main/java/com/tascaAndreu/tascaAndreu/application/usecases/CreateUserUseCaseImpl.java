package com.tascaAndreu.tascaAndreu.application.usecases;

import com.tascaAndreu.tascaAndreu.domain.models.User;
import com.tascaAndreu.tascaAndreu.domain.ports.in.CreateUserUseCase;
import com.tascaAndreu.tascaAndreu.domain.ports.out.UserRepositoryPort;

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
