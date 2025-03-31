package com.tascaAndreu.tascaAndreu.application.usecases;


import com.tascaAndreu.tascaAndreu.domain.models.User;
import com.tascaAndreu.tascaAndreu.domain.ports.in.RetrieveUserUseCase;
import com.tascaAndreu.tascaAndreu.domain.ports.out.UserRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveUserUseCaseImpl implements RetrieveUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public RetrieveUserUseCaseImpl(UserRepositoryPort taskRepositoryPort) {
        this.userRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<User> retrievUser(Long id) {
        return userRepositoryPort.findById(id);
    }

    @Override
    public List<User> retrievUsers() {
        return userRepositoryPort.findAll();
    }
}
