package com.github.manimovassagh.multipleSpringAPI.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@RequiredArgsConstructor

@Builder

public class CourseMaterial {

    @Override
    public String toString() {
        return "CourseMaterial{" +
                "courseMaterialId=" + courseMaterialId +
                ", url='" + url + '\'' +
                ", course=" + course +
                '}';
    }

    @Id
    @SequenceGenerator(
            name = "course_material_sequence",
            sequenceName = "course_material_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_material_sequence"
    )
    private Long courseMaterialId;
    private String url;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(
            name = "course_id",
            referencedColumnName = "courseId"
    )
    @ToString.Exclude
    private Course course;

    public CourseMaterial(Long courseMaterialId, String url, Course course) {
        this.courseMaterialId = courseMaterialId;
        this.url = url;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CourseMaterial that = (CourseMaterial) o;
        return Objects.equals(courseMaterialId, that.courseMaterialId);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
