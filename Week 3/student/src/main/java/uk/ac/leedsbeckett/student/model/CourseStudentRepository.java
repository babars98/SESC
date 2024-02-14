package uk.ac.leedsbeckett.student.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseStudentRepository extends JpaRepository<CourseStudent, Long> {
}
