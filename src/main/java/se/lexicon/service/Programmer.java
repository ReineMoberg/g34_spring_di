package se.lexicon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer implements Employee {

    private SalaryService salaryService; //An interface (data type). No instance (object) here.
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
    public int getSalary() {              // Makes a method call to passed object that implements interface
        return salaryService.getSalary(); // random value
    }
}
