package com.tascaAndreu.tascaAndreu.application.services;


import com.tascaAndreu.tascaAndreu.domain.models.User;
import com.tascaAndreu.tascaAndreu.domain.ports.in.CreateUserUseCase;
import com.tascaAndreu.tascaAndreu.domain.ports.in.DeleteUserUseCase;
import com.tascaAndreu.tascaAndreu.domain.ports.in.RetrieveUserUseCase;
import com.tascaAndreu.tascaAndreu.domain.ports.in.UpdateUserUseCase;

import java.util.List;
import java.util.Optional;

public class UserService implements CreateUserUseCase, UpdateUserUseCase, DeleteUserUseCase, RetrieveUserUseCase
{

    private final CreateUserUseCase createUserUseCase;
    private final RetrieveUserUseCase retrieveUserUseCase;
    private final DeleteUserUseCase deleteUserUseCase;
    private final UpdateUserUseCase updateUserUseCase;


    public UserService(CreateUserUseCase createUserUseCase, RetrieveUserUseCase retrieveUserUseCase, DeleteUserUseCase deleteUserUseCase, UpdateUserUseCase updateUserUseCase) {
        this.createUserUseCase = createUserUseCase;
        this.retrieveUserUseCase = retrieveUserUseCase;
        this.deleteUserUseCase = deleteUserUseCase;
        this.updateUserUseCase = updateUserUseCase;
    }

    @Override
    public User createUser(User user) {
        return createUserUseCase.createUser(user);
    }

    @Override
    public boolean deleteUser(Long id) {
        return deleteUserUseCase.deleteUser(id);
    }

    @Override
    public Optional<User> retrieveUser(Long id)
    {
        return retrieveUserUseCase.retrieveUser(id);
    }

    @Override
    public List<User> retrieveUsers()
    {
        return retrieveUserUseCase.retrieveUsers();
    }

    @Override
    public Optional<User> updateUser(Long id, User updateUser) {
        return updateUserUseCase.updateUser(id, updateUser);
    }
}
