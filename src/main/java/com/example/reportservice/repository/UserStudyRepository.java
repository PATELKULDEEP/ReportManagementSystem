package com.example.reportservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reportservice.entity.*;

public interface UserStudyRepository extends JpaRepository<UserStudy, UserStudyId>{
    List<UserStudy> findByUserId(Long userId);
}
