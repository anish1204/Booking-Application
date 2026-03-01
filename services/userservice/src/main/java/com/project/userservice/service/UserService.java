package com.project.userservice.service;

import com.project.userservice.modal.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUserById(Long id);

    List<User> getAllUser();

    void deleteUser (Long id);

    User updateUser(User user);

}
