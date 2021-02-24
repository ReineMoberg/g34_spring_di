package se.lexicon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer implements Employee {

    private SalaryService salaryService;
    // dependency injection in setter

    @Autowired
    public void setSalaryService(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

     /*
    // dependency injection in constructor
    @Autowired
    public Programmer(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

     */


    @Override
    public String getDescription() {
        return "Helloooooooooooooooooooo";
    }

    @Override
    public int getSalary() {
        return salaryService.getSalary(); // random value
    }
}
