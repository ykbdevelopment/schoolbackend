package com.project.testkari.controller;

import com.project.testkari.dto.TeacherDto;
import com.project.testkari.entity.TeacherEntity;
import com.project.testkari.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("teacher")
@CrossOrigin(origins = "*")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @GetMapping("getTeachers")
    public List<TeacherDto> getTeachers(){
        return teacherService.getTeachers();
    }

    @GetMapping("getTeacherById/{id}")
    public TeacherEntity getTeacherById(@PathVariable Long id){
        return teacherService.getTeacherbyId(id);
    }
}
