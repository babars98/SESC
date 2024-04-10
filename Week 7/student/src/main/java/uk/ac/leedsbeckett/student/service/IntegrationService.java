package uk.ac.leedsbeckett.student.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import uk.ac.leedsbeckett.student.model.Account;

@Component
public class IntegrationService {

    private final RestTemplate restTemplate;

    public IntegrationService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public Account getStudentAccount(String studentId){
        return restTemplate.getForObject("http://localhost:8090/account/student/" + studentId, Account.class);
    }
}
