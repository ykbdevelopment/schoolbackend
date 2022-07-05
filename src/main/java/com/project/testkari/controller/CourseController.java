package com.project.testkari.controller;

import com.project.testkari.entity.CourseEntity;
import com.project.testkari.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("getCourses")
    public List<CourseEntity> getCourses() {
        List<CourseEntity> courseEntityList = courseService.getCourses();
        return courseEntityList;
    }
}
