package com.project.testkari.dto;

import com.project.testkari.entity.CourseEntity;

public interface ISubject {
    Long getId();
    String getName();
    Long getIdCourse();
    String getGrade();
    String getClassroom();
}
