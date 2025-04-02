package com.tascaandreu.tascaandreu.application.usecases;



import com.tascaandreu.tascaandreu.domain.models.User;
import com.tascaandreu.tascaandreu.domain.ports.in.UpdateUserUseCase;
import com.tascaandreu.tascaandreu.domain.ports.out.UserRepositoryPort;

import java.util.Optional;

public class UpdateUserUseCaseImpl implements UpdateUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public UpdateUserUseCaseImpl(UserRepositoryPort taskRepositoryPort) {
        this.userRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<User> updateUser(Long id, User updateUser) {
        return userRepositoryPort.updateUser(updateUser);
    }
}
