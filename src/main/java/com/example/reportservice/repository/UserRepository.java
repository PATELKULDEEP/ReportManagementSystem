package com.example.reportservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reportservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findBySsoId(String ssoId);
    Optional<User> findByEmail(String email);
}
