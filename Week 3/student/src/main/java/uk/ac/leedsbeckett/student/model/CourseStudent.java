package uk.ac.leedsbeckett.student.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CourseStudent {


    @EmbeddedId
    private CourseStudentKey id = new CourseStudentKey();

    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name="course_id")
    private Course course;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name="student_id")
    private Student student;

    public CourseStudent(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public CourseStudent() {
    }
}
