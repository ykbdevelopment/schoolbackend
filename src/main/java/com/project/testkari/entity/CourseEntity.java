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
@Table(name = "course")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CourseEntity implements Serializable {

    @Id
    private Long id;

    @Column
    private String grade;

    @Column
    private String classroom;

    @ManyToOne
    @JoinColumn(name = "id_school")
    @JsonIgnoreProperties("courses")
    private SchoolEntity school;

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("students")
    private List<SubjectEntity> subjects;


}

