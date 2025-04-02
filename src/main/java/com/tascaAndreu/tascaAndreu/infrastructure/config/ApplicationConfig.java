package com.tascaandreu.tascaandreu.infrastructure.config;

import com.tascaandreu.tascaandreu.application.services.UserService;
import com.tascaandreu.tascaandreu.application.usecases.CreateUserUseCaseImpl;
import com.tascaandreu.tascaandreu.application.usecases.DeleteUserUseCaseImpl;
import com.tascaandreu.tascaandreu.application.usecases.RetrieveUserUseCaseImpl;
import com.tascaandreu.tascaandreu.application.usecases.UpdateUserUseCaseImpl;
import com.tascaandreu.tascaandreu.domain.ports.out.UserRepositoryPort;
import com.tascaandreu.tascaandreu.infrastructure.repositories.JpaUserRepositoryAdapter;
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
