package com.project.testkari.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "subject")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class SubjectEntity implements Serializable {

    @Id
    private Long id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_course")
    @JsonIgnoreProperties("subjects")
    private CourseEntity course;

    @ManyToOne
    @JoinColumn(name = "id_teacher")
    @JsonIgnoreProperties("subjects")
    private TeacherEntity teacher;

    @ManyToMany(mappedBy = "subjects", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("subjects")
    private List<StudentEntity> students;
}
