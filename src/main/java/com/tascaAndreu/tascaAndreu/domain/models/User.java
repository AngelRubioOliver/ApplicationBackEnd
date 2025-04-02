package com.tascaandreu.tascaandreu.domain.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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
