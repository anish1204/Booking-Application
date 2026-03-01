package com.project.userservice.service.impl;

import com.project.userservice.exception.UserException;
import com.project.userservice.modal.User;
import com.project.userservice.repository.UserRepository;
import com.project.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) throws UserException {
        Optional<User> otp = userRepository.findById(id);
        if(otp.isPresent())
        {
            return otp.get();
        }
        throw new UserException("user Not Found");

    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty())
        {
            throw new Exception("No user found ");
        }
        userRepository.deleteById(id);
        return  "user deleted Successfully";

    }

    @Override
    public User updateUser(User user,Long id) {
        Optional<User> otp = userRepository.findById(id);
        if(otp.isEmpty())
        {
            throw new Exception("user not found with Id"+id);
        }
        User existingUser = otp.get();
        existingUser.setFullName(user.getFullName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPhone(user.getPhone());
        existingUser.setRole(user.getRole());

        return userRepository.save(existingUser);
    }
}
