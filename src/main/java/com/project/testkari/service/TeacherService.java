package com.project.testkari.service;

import com.project.testkari.dto.TeacherDto;
import com.project.testkari.entity.TeacherEntity;
import com.project.testkari.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<TeacherDto> getTeachers() {
        return teacherRepository.getTeachers();
    }

    public TeacherEntity getTeacherbyId (Long id){
        return teacherRepository.findById(id).orElse(null);
    }
}