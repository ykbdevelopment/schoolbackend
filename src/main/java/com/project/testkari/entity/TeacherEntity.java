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
@Table(name = "teacher")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class TeacherEntity implements Serializable {

    @Id
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("students")
    private List<SubjectEntity> subjects;
}
