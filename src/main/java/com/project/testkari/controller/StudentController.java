package com.project.testkari.controller;

import com.project.testkari.entity.StudentEntity;
import com.project.testkari.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
@CrossOrigin(origins = "*")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("getStudents")
    public List<StudentEntity> getStudents() {
        List<StudentEntity> studentEntityList = studentService.getStudents();
        return studentEntityList;
    }
}
