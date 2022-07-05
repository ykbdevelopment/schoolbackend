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
@Table(name = "student")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class StudentEntity implements Serializable {

    @Id
    private Long id;

    @Column
    private String name;

    @ManyToMany
    @JoinTable(
            name="student_subject",
            joinColumns = @JoinColumn(name= "id_student"),
            inverseJoinColumns = @JoinColumn(name = "id_subject"))
    @JsonIgnoreProperties("students")
    private List<SubjectEntity> subjects;

}
