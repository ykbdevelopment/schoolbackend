package com.project.testkari.service;

import com.project.testkari.dto.ISubject;
import com.project.testkari.entity.SubjectEntity;
import com.project.testkari.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<ISubject> getSubjectsbyTeacher(Long id) {
        return subjectRepository.getSubjectsbyTeacher(id);
    }

    public List<String> getStudentsBySubjectJPA(Long id) {
        return  subjectRepository.getStudentsBySubjectJPA(id);
    }
}
