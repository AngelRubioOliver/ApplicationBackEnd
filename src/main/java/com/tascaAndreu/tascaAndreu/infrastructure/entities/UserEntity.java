package com.tascaandreu.tascaandreu.infrastructure.entities;

import com.tascaandreu.tascaandreu.domain.models.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "usuaris")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;


    private String email;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;


    public static UserEntity fromDomainModel(User user) {
        return new UserEntity(user.getId(), user.getUsername(), user.getEmail(), user.getCreatedAt());
    }

    public User toDomainModel() {
        return new User(id, username, email, createdAt);
    }
}
