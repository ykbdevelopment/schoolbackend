package com.project.testkari.service;

import com.project.testkari.entity.StudentEntity;
import com.project.testkari.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentEntity> getStudents() {
        return (List<StudentEntity>) studentRepository.findAll();
    }
}
