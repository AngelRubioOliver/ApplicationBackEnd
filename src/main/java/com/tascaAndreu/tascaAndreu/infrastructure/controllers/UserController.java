package com.tascaandreu.tascaandreu.infrastructure.controllers;


import com.tascaandreu.tascaandreu.application.services.UserService;
import com.tascaandreu.tascaandreu.domain.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable Long userId) {
        return userService.retrieveUser(userId).map(task -> new ResponseEntity<>(task, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser() {
        List<User> users = userService.retrieveUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    // Actualizacion tarea
    @PutMapping("/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable Long userId, @RequestBody User updatedUser) {
        return userService.updateUser(userId, updatedUser).map(task -> new ResponseEntity<>(task, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Eliminacion tarea
    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
        if (userService.deleteUser(userId)){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);


        }
    }
}
