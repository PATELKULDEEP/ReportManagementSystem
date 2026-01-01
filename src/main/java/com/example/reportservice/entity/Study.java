package com.example.reportservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "studies")
public class Study {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "study_code", nullable = false, unique = true)
    private String studyCode;

    @Column(name = "study_name")
    private String studyName;

    private String status;

    public Long getId() {
        return id;
    }

    public String getStudyCode() {
        return studyCode;
    }

    public void setStudyCode(String studyCode) {
        this.studyCode = studyCode;
    }

    public String getStudyName() {
        return studyName;
    }

    public void setStudyName(String studyName) {
        this.studyName = studyName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
