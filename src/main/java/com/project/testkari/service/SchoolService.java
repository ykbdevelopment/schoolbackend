package com.project.testkari.service;

import com.project.testkari.entity.SchoolEntity;
import com.project.testkari.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    public List<SchoolEntity> getSchools() {
        return (List<SchoolEntity>) schoolRepository.findAll();
    }
}
