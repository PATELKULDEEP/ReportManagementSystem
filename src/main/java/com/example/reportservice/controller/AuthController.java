package com.example.reportservice.controller;

import org.springframework.web.bind.annotation.*;

import com.example.reportservice.entity.User;
import com.example.reportservice.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {
    
    private final UserService userService;

    public AuthController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/login")
    public User login(@RequestParam String ssoId, @RequestParam String email, @RequestParam(required = false) String name){
        return userService.getOrCreateUser(ssoId, email, name);
    }
}
