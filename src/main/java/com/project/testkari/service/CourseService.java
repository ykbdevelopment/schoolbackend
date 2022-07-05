package com.project.testkari.service;

import com.project.testkari.entity.CourseEntity;
import com.project.testkari.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<CourseEntity> getCourses() {
        return (List<CourseEntity>) courseRepository.findAll();
    }
}
