package com.project.testkari.controller;

import com.project.testkari.dto.ISubject;
import com.project.testkari.entity.SubjectEntity;
import com.project.testkari.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("subject")
@CrossOrigin(origins = "*")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @GetMapping("getSubjectsbyTeacher/{id}")
    public List<ISubject> getSubjectsbyTeacher(@PathVariable Long id) { return subjectService.getSubjectsbyTeacher(id); }

    @GetMapping("getStudentsBySubjectJPA/{id}")
    public List<String> getStudentsBySubjectJPA(@PathVariable Long id) {
        List<String> studentEntityList = subjectService.getStudentsBySubjectJPA(id);
        return studentEntityList;
    }
}
