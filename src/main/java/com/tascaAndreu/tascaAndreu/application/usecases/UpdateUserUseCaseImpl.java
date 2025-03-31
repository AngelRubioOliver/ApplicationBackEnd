package com.tascaAndreu.tascaAndreu.application.usecases;



import com.tascaAndreu.tascaAndreu.domain.models.User;
import com.tascaAndreu.tascaAndreu.domain.ports.in.UpdateUserUseCase;
import com.tascaAndreu.tascaAndreu.domain.ports.out.UserRepositoryPort;

import java.util.Optional;

public class UpdateUserUseCaseImpl implements UpdateUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public UpdateUserUseCaseImpl(UserRepositoryPort taskRepositoryPort) {
        this.userRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<User> updateUser(Long id, User updateUser) {
        return userRepositoryPort.updateTask(updateUser);
    }
}
