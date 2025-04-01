package com.tascaAndreu.tascaAndreu.infrastructure.config;

import com.tascaAndreu.tascaAndreu.application.services.UserService;
import com.tascaAndreu.tascaAndreu.application.usecases.CreateUserUseCaseImpl;
import com.tascaAndreu.tascaAndreu.application.usecases.DeleteUserUseCaseImpl;
import com.tascaAndreu.tascaAndreu.application.usecases.RetrieveUserUseCaseImpl;
import com.tascaAndreu.tascaAndreu.application.usecases.UpdateUserUseCaseImpl;
import com.tascaAndreu.tascaAndreu.domain.ports.out.UserRepositoryPort;
import com.tascaAndreu.tascaAndreu.infrastructure.repositories.JpaUserRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationConfig {

    @Bean
    public UserService userService(UserRepositoryPort userRepositoryPort) {
        return new UserService(
                new CreateUserUseCaseImpl(userRepositoryPort),
                new RetrieveUserUseCaseImpl(userRepositoryPort),
                new DeleteUserUseCaseImpl(userRepositoryPort),
                new UpdateUserUseCaseImpl(userRepositoryPort)


        );
    }
    @Bean
    public UserRepositoryPort userRepositoryPort(JpaUserRepositoryAdapter jpaTaskRepositoryAdapter) {
        return jpaTaskRepositoryAdapter;

    }


}
