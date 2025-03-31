package com.tascaAndreu.tascaAndreu;


import com.tascaAndreu.tascaAndreu.domain.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloWorldController
{
    @GetMapping(path = "/hello")
    public String helloWorld()
    {
       User user = new User(1, "username", "email@example.com", LocalDateTime.now());

        return user.getUsername();
    }
}
