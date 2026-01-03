package com.example.reportservice.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

@Embeddable
public class UserStudyId implements Serializable{

    private Long userId;
    private Long studyId;

    public UserStudyId(){}

    public UserStudyId(Long userId, Long studyId){
        this.userId = userId;
        this.studyId = studyId;
    }

    @Override
    public boolean equals(Object o){

        if(this == o) return true;
        if(!(o instanceof UserStudyId)) return false;
        UserStudyId that = (UserStudyId) o;

        return Objects.equals(userId, that.userId) && Objects.equals(studyId, that.studyId);

    }

    @Override
    public int hashCode(){
        return Objects.hash(userId, studyId);
    }
    
    
}
