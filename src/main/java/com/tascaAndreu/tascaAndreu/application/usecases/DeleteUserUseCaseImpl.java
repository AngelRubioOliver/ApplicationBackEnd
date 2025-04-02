package com.tascaandreu.tascaandreu.application.usecases;


import com.tascaandreu.tascaandreu.domain.ports.in.DeleteUserUseCase;
import com.tascaandreu.tascaandreu.domain.ports.out.UserRepositoryPort;

public class DeleteUserUseCaseImpl implements DeleteUserUseCase
{
    private final UserRepositoryPort userRepositoryPort;

    public DeleteUserUseCaseImpl(UserRepositoryPort taskRepositoryPort) {
        this.userRepositoryPort = taskRepositoryPort;
    }

    @Override
    public boolean deleteUser(Long id) {
        return userRepositoryPort.deleteUser(id);
    }
}
