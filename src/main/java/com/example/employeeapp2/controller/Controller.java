package com.example.employeeapp2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String Homepage(){
        return "Welcome to Employee Homepage";
    }

    @GetMapping("/add")
    public String AddEmployee(){
        return "ADD EMPLOYEE";
    }
}
