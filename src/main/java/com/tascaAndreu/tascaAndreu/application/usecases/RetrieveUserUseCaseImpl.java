package com.tascaandreu.tascaandreu.application.usecases;


import com.tascaandreu.tascaandreu.domain.models.User;
import com.tascaandreu.tascaandreu.domain.ports.in.RetrieveUserUseCase;
import com.tascaandreu.tascaandreu.domain.ports.out.UserRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveUserUseCaseImpl implements RetrieveUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public RetrieveUserUseCaseImpl(UserRepositoryPort taskRepositoryPort) {
        this.userRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<User> retrieveUser(Long id) {
        return userRepositoryPort.findById(id);
    }

    @Override
    public List<User> retrieveUsers() {
        return userRepositoryPort.findAll();
    }
}
