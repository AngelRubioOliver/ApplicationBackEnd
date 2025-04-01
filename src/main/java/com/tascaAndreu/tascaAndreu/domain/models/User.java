package com.tascaAndreu.tascaAndreu.domain.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private Long id;

    private String username;


    private String email;


    private LocalDateTime createdAt;

}
