package com.project.userservice.controller;

import com.project.userservice.modal.User;
import com.project.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @PostMapping("/api/users")
    public User createUser(@RequestBody User user)
    {
        return userRepository.save(user);
    }

    @GetMapping("/api/users")
    public User getUser()
    {
        User user = new User();
        user.setFullName("Anish");
        user.setEmail("anish@gmail.com");
        user.setRole("ADMIN");
        user.setPassword("password");
        user.setPhone("+91 8355995075");
        return user;
    }

}
