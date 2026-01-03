package com.example.reportservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_studies")
public class UserStudy {
    
    @EmbeddedId
    private UserStudyId id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("studyId")
    @JoinColumn(name = "study_id")
    private Study study;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Study getStudy() {
        return study;
    }

    public void setStudy(Study study) {
        this.study = study;
    }

    
}
