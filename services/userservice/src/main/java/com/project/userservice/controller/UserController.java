package com.project.userservice.controller;

import com.project.userservice.exception.UserException;
import com.project.userservice.modal.User;
import com.project.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/api/users")
    public User createUser(@RequestBody User user)
    {
    }

    @GetMapping("/api/users")
    public List<User> getUsers()
    {

    }

    @GetMapping("/api/users/{id}")
    public User getUserById(@PathVariable Long id) throws Exception
    {
}

    @PutMapping("/api/user/{id}")
    public User updateUser (@RequestBody User user,@PathVariable Long id) throws Exception
    {

    }


    @DeleteMapping("/api/user/{id}")
    public String deleteUserById(@PathVariable Long id) throws Exception
    {
 }


}
