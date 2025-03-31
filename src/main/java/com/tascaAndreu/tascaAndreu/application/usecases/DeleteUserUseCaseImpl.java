package com.tascaAndreu.tascaAndreu.application.usecases;


import com.tascaAndreu.tascaAndreu.domain.ports.in.DeleteUserUseCase;
import com.tascaAndreu.tascaAndreu.domain.ports.out.UserRepositoryPort;

public class DeleteUserUseCaseImpl implements DeleteUserUseCase
{
    private final UserRepositoryPort userRepositoryPort;

    public DeleteUserUseCaseImpl(UserRepositoryPort taskRepositoryPort) {
        this.userRepositoryPort = taskRepositoryPort;
    }

    @Override
    public boolean deleteUser(Long id) {
        return userRepositoryPort.deleteTask(id);
    }
}
