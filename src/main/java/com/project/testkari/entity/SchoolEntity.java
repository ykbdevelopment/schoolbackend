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
@Table(name = "school")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class SchoolEntity implements Serializable {

    @Id
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "school", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("subjects")
    private List<CourseEntity> courses;
}
