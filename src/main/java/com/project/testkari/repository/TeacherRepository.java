package com.project.testkari.repository;

import com.project.testkari.dto.TeacherDto;
import com.project.testkari.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity,Long> {
    @Query("SELECT new com.project.testkari.dto.TeacherDto(t.id, t.name) " +
            "FROM TeacherEntity t ")
    List<TeacherDto> getTeachers();
}
