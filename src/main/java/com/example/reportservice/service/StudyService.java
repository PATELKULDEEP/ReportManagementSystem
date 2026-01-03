package com.example.reportservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.reportservice.entity.Study;
import com.example.reportservice.entity.User;
import com.example.reportservice.entity.UserStudy;
import com.example.reportservice.repository.UserStudyRepository;

@Service
public class StudyService {
    private final UserStudyRepository userStudyRepository;

    public StudyService(UserStudyRepository userStudyRepository){
        this.userStudyRepository = userStudyRepository;
    }

    public List<Study> getStudiesForUser(User user){
        List<UserStudy> mappings = userStudyRepository.findByUserId(user.getId());
        return mappings.stream().map(UserStudy::getStudy).collect(Collectors.toList());
    }
}
