package uk.ac.leedsbeckett.student;

import org.springframework.context.annotation.Configuration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import uk.ac.leedsbeckett.student.model.*;

@Configuration
public class MiscellaneousBeans {
    @Bean
    CommandLineRunner initDatabase(CourseRepository courseRepository, StudentRepository studentRepository, CourseStudentRepository courseStudentRepository) {
        return args -> {
            Course myCourse = new Course();
            myCourse.setTitle("SESC");
            myCourse.setDescription("Software Engineering for Service Computing");
            myCourse.setFee(10.00);
            courseRepository.save(myCourse);

            Course course1 = new Course();
            course1.setTitle("ISR");
            course1.setDescription("Intelligent System and Robotics");
            course1.setFee(20.00);
            courseRepository.save(course1);

            Course course2 = new Course();
            course2.setTitle("PM");
            course2.setDescription("Project Management");
            course2.setFee(15.00);
            courseRepository.save(course2);

            Course course3 = new Course();
            course3.setTitle("SS");
            course3.setDescription("Smart Systems");
            course3.setFee(25.00);
            courseRepository.save(course3);

            Student student1 = new Student();
            student1.setStudentId("C77365221");
            student1.setFirstName("Muhammad");
            student1.setLastName("Ali");
            studentRepository.save(student1);

            Student student2 = new Student();
            student2.setStudentId("C35365205");
            student2.setFirstName("Amit");
            student2.setLastName("Sharma");
            studentRepository.save(student2);

            Student student3 = new Student();
            student3.setStudentId("C77587236");
            student3.setFirstName("Noman");
            student3.setLastName("Khan");
            studentRepository.save(student3);

            courseStudentRepository.save(new CourseStudent(student1, course1));
            courseStudentRepository.save(new CourseStudent(student1, course2));
            courseStudentRepository.save(new CourseStudent(student2, course2));
            courseStudentRepository.save(new CourseStudent(student2, course3));
            
        };
    }
}