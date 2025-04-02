package com.tascaandreu.tascaandreu.infrastructure.repositories;


import com.tascaandreu.tascaandreu.domain.models.User;
import com.tascaandreu.tascaandreu.domain.ports.out.UserRepositoryPort;
import com.tascaandreu.tascaandreu.infrastructure.entities.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class JpaUserRepositoryAdapter implements UserRepositoryPort {
    private final JpaUserRepository jpaUserRepository;

    public JpaUserRepositoryAdapter(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = UserEntity.fromDomainModel(user);
        UserEntity savedUserEntity = jpaUserRepository.save(userEntity);
        return savedUserEntity.toDomainModel();
    }

    @Override
    public Optional<User> findById(Long id) {
        return jpaUserRepository.findById(id).map(UserEntity::toDomainModel);
    }

    @Override
    public List<User> findAll() {
        return jpaUserRepository.findAll().stream().map(UserEntity::toDomainModel).toList();
    }

    @Override
    public Optional<User> updateUser(User user) {
        if (jpaUserRepository.existsById(user.getId())) {
            UserEntity userEntity = UserEntity.fromDomainModel(user);
            UserEntity updatedUserEntity = jpaUserRepository.save(userEntity);
            return Optional.of(updatedUserEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteUser(Long id) {
        if(jpaUserRepository.existsById(id)){
            jpaUserRepository.deleteById(id);
            return true;
        }
        return false;

    }


}
