package uk.ac.leedsbeckett.student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class CourseStudentKey implements Serializable {
    @Column(name = "studentId")
    Long studentId;

    @Column(name = "courseId")
    Long courseId;
}