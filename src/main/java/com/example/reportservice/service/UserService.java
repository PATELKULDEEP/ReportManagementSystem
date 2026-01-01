package com.example.reportservice.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.reportservice.entity.User;
import com.example.reportservice.repository.UserRepository;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    //this is constructor injection best practice
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User getOrCreateUser(String ssoId, String email, String name){
        Optional<User> existingUser = userRepository.findBySsoId(ssoId);

        if(existingUser.isPresent()){
            return existingUser.get();
        }

        User newUser = new User();
        newUser.setSsoId(ssoId);
        newUser.setEmail(email);
        newUser.setName(name);

        return userRepository.save(newUser);
    }
}
