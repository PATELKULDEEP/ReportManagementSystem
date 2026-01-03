package com.example.reportservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reportservice.entity.Study;

public interface StudyRepository extends JpaRepository<Study, Long> {
    
}
