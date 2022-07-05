package com.project.testkari.controller;

import com.project.testkari.entity.SchoolEntity;
import com.project.testkari.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("school")
public class SchoolController {
    @Autowired
    SchoolService schoolService;

    @GetMapping("getSchools")
    public List<SchoolEntity> getSchools() {
        List<SchoolEntity> schoolEntityList = schoolService.getSchools();
        return schoolEntityList;
    }
}
