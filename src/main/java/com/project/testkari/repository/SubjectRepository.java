package com.project.testkari.repository;

import com.project.testkari.dto.ISubject;
import com.project.testkari.entity.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectEntity,Long> {
    @Query(value = "SELECT s.name FROM student_subject sb INNER JOIN student s ON sb.id_student = s.id WHERE sb.id_subject = ?1",nativeQuery = true)
    List<String> getStudentsBySubject(Long id);

    @Query(value = "SELECT se.name as name FROM StudentEntity se JOIN se.subjects subj WHERE subj.id = ?1")
    List<String> getStudentsBySubjectJPA(Long id);

    @Query("SELECT se.id as id, se.name as name, se.course.id as idCourse, se.course.grade as grade, se.course.classroom as classroom " +
            "FROM SubjectEntity se JOIN se.teacher teach WHERE teach.id = ?1")
    List<ISubject> getSubjectsbyTeacher(Long id);
}
