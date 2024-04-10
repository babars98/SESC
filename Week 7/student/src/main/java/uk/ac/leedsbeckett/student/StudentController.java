package uk.ac.leedsbeckett.student;

import org.springframework.web.bind.annotation.*;
import uk.ac.leedsbeckett.student.model.Account;
import uk.ac.leedsbeckett.student.service.IntegrationService;

@RestController
@RequestMapping("/api")
public class StudentController {
    private final IntegrationService integrationService;

    public StudentController(IntegrationService integrationService) {
        this.integrationService = integrationService;
    }

    @GetMapping("/student/account/{studentId}")
    public Account getStudentAccount(@PathVariable String studentId) {
        return integrationService.getStudentAccount(studentId);
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name)
    {

        return "Hello ";
    }
}
